package com.example.demo.service;

import com.example.demo.model.OrderItems;
import com.example.demo.repository.IOrderItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServiceImpl implements IOrderItemsService{

   @Autowired
   IOrderItemsRepo orderItemRepo;

   @Autowired
   public OrderItemServiceImpl(IOrderItemsRepo theOrderItemRepo){
       orderItemRepo = theOrderItemRepo;
   }

    @Override
    public List<OrderItems> findAll() {
        return orderItemRepo.findAll();
    }

    @Override
    public Optional<OrderItems> findById(int id) {
        return orderItemRepo.findById(id);
    }

    @Override
    public void save(OrderItems orderItems) {
       orderItemRepo.save(orderItems);

    }

    @Override
    public void deleteById(int id) {
       orderItemRepo.deleteById(id);

    }
}
