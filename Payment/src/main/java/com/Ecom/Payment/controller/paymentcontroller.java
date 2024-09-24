package com.Ecom.Payment.controller;

import com.Ecom.Payment.Entity.payment;
import com.Ecom.Payment.services.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class paymentcontroller {
    @Autowired
    private Paymentservice paymentservice;
    @PostMapping("/makepayment")
    public payment makepayment(payment pay){
        return paymentservice.makepayment(pay);
    }
    @GetMapping("/getpaymentdetails")
    public List<payment> getpaymentdetails(){
        return paymentservice.getpaymentdetails();
    }
}
