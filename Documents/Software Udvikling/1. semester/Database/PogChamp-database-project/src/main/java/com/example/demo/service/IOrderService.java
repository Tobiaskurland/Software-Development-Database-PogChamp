package com.example.demo.service;

import com.example.demo.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IOrderService {

    public List<Order> findAll();

    public Optional<Order> findById(int id);

    public void save(Order order);

    public void deleteById(int id);
}
