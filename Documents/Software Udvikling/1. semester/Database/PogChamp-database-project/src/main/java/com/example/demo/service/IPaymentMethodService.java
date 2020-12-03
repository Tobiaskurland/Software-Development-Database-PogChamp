package com.example.demo.service;

import com.example.demo.model.PaymentMethod;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IPaymentMethodService {

    public List<PaymentMethod> findAll();

    public Optional<PaymentMethod> findById(int id);

    public void save(PaymentMethod paymentMethod);

    public void delete(int id);
}
