package com.example.demo.service;

import com.example.demo.model.OrderItems;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IOrderItemsService {

    public List<OrderItems> findAll();

    public Optional<OrderItems> findById(int id);

    public void save(OrderItems orderItems);

    public void deleteById(int id);
}
