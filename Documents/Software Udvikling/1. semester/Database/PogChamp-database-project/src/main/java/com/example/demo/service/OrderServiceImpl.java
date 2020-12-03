package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    IOrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(IOrderRepo theOrderRepo){
        orderRepo = theOrderRepo;
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public Optional<Order> findById(int id) {
        return orderRepo.findById(id);
    }

    @Override
    public void save(Order order) {
        orderRepo.save(order);

    }

    @Override
    public void deleteById(int id) {
        orderRepo.deleteById(id);

    }
}
