package com.Ecom.Payment.feignclient;

import com.Ecom.Payment.config.Ordermodel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="orders",url="http://localhost:8083")
public interface Orderclient {
    @PostMapping("/orders/placeorder")
    public Ordermodel placeorder(@RequestBody Ordermodel ordermodel);
    @DeleteMapping("/orders/cancelorder/{orderid}")
    public void deleteorder(@PathVariable("orderid") Integer orderid);
}
