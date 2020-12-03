package com.example.demo.service;

import com.example.demo.model.FinalOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IFinalOrderService {

    public List<FinalOrder> findAll();

    public Optional<FinalOrder> findById(int id);
}
