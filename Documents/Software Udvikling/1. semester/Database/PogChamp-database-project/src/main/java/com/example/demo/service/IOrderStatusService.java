package com.example.demo.service;

import com.example.demo.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IOrderStatusService {

    public List<OrderStatus> findAll();

    public Optional<OrderStatus> findById(int id);

    public void save(OrderStatus orderStatus);

    public void delete(int id);
}
