package com.example.demo.service;

import com.example.demo.model.OrderStatus;
import com.example.demo.repository.IOrderStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderStatusServiceImpl implements IOrderStatusService{

    @Autowired
    IOrderStatusRepo orderStatusRepo;

    @Autowired
    public OrderStatusServiceImpl(IOrderStatusRepo theOrderStatusRepo){
        orderStatusRepo = theOrderStatusRepo;
    }

    @Override
    public List<OrderStatus> findAll() {
        return orderStatusRepo.findAll();
    }

    @Override
    public Optional<OrderStatus> findById(int id) {
        return orderStatusRepo.findById(id);
    }

    @Override
    public void save(OrderStatus orderStatus) {
        orderStatusRepo.save(orderStatus);

    }

    @Override
    public void delete(int id) {
        orderStatusRepo.deleteById(id);

    }
}
