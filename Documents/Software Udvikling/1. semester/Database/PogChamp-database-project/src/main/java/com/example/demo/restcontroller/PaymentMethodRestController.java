package com.example.demo.restcontroller;

import com.example.demo.model.PaymentMethod;
import com.example.demo.service.PaymentMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentMethodRestController {

    @Autowired
    PaymentMethodServiceImpl paymentMethodService;

    @Autowired
    public PaymentMethodRestController(PaymentMethodServiceImpl thePaymentMethodService){
        paymentMethodService = thePaymentMethodService;
    }

    @GetMapping("/paymentMethods")
    public List<PaymentMethod> findAll(){
        return paymentMethodService.findAll();
    }

    @GetMapping("/paymentMethod/{paymentMethodId}")
    public Optional<PaymentMethod> getPaymentMethod(@PathVariable int paymentMethodId){
        Optional<PaymentMethod> paymentMethod = paymentMethodService.findById(paymentMethodId);

        if (paymentMethod == null){
            throw new RuntimeException("payment method id not found - " + paymentMethodId);
        }

        return paymentMethod;
    }

    @PostMapping("/paymentMethod")
    public PaymentMethod addPaymentMethod(@RequestBody PaymentMethod paymentMethod){

        paymentMethod.setId(0);

        paymentMethodService.save(paymentMethod);

        return paymentMethod;
    }

    @PutMapping("/paymentMethod")
    public PaymentMethod updateMethod(@RequestBody PaymentMethod paymentMethod){

        paymentMethodService.save(paymentMethod);

        return paymentMethod;
    }

    @DeleteMapping("/paymentMethod/{paymentMethodId}")
    public String deletePaymentMethod(@PathVariable int paymentMethodId){
        Optional<PaymentMethod> tempPaymentMethod = paymentMethodService.findById(paymentMethodId);

        if (tempPaymentMethod == null){
            throw new RuntimeException("Payment method id not found - " + paymentMethodId);
        }

        paymentMethodService.delete(paymentMethodId);

        return "Deleted payment method id - " + paymentMethodId;
    }
}
