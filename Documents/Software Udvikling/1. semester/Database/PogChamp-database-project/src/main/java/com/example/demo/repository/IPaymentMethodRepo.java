package com.example.demo.repository;

import com.example.demo.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPaymentMethodRepo  extends JpaRepository<PaymentMethod, Integer> {

}
