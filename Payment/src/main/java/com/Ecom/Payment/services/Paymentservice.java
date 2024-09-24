package com.Ecom.Payment.services;

import com.Ecom.Payment.Entity.payment;
import com.Ecom.Payment.Repository.PayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class Paymentservice {
    Scanner sc=new Scanner(System.in);
    @Autowired PayRepo payrepo;
    public payment makepayment(payment pay) {
        return payrepo.save(pay);
    }

    public List<payment> getpaymentdetails() {
        return payrepo.findAll();
    }
}
