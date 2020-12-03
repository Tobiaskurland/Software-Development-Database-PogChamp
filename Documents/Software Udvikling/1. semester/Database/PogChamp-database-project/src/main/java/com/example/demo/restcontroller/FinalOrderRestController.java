package com.example.demo.restcontroller;

import com.example.demo.model.FinalOrder;
import com.example.demo.service.FinalOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FinalOrderRestController {

    @Autowired
    FinalOrderServiceImpl finalOrderService;

   @Autowired
   public FinalOrderRestController(FinalOrderServiceImpl theFinalOrderService){
       finalOrderService = theFinalOrderService;
   }

   @GetMapping("/finalOrders")
    public List<FinalOrder> findAll(){
       return finalOrderService.findAll();
   }

   @GetMapping("/finalOrder/{finalOrderId}")
    public Optional<FinalOrder> getFinalOrder(@PathVariable int finalOrderId){
       Optional<FinalOrder> finalOrder = finalOrderService.findById(finalOrderId);

       if (finalOrder == null){
           throw new RuntimeException("Final order id not found - " + finalOrderId);
       }

       return finalOrder;
   }

}
