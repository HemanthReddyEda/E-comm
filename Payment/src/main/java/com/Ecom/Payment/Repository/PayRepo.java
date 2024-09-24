package com.Ecom.Payment.Repository;

import com.Ecom.Payment.Entity.payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepo extends JpaRepository<payment,Integer> {
}