package com.example.demo.service;

import com.example.demo.model.PaymentMethod;
import com.example.demo.repository.IPaymentMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodServiceImpl implements IPaymentMethodService{

    @Autowired
    IPaymentMethodRepo paymentMethodRepo;

    @Autowired
    public PaymentMethodServiceImpl(IPaymentMethodRepo thePayMethodRepo){
        paymentMethodRepo = thePayMethodRepo;
    }

    @Override
    public List<PaymentMethod> findAll() {
        return paymentMethodRepo.findAll();
    }

    @Override
    public Optional<PaymentMethod> findById(int id) {
        return paymentMethodRepo.findById(id);
    }

    @Override
    public void save(PaymentMethod paymentMethod) {
        paymentMethodRepo.save(paymentMethod);

    }

    @Override
    public void delete(int id) {
        paymentMethodRepo.deleteById(id);

    }
}
