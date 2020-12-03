package com.example.demo.service;

import com.example.demo.model.FinalOrder;
import com.example.demo.repository.IFinalOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FinalOrderServiceImpl implements IFinalOrderService{

    @Autowired
    IFinalOrderRepo finalOrderRepo;

    @Autowired
    public FinalOrderServiceImpl(IFinalOrderRepo theFinalOrderRepo){
        finalOrderRepo = theFinalOrderRepo;
    }

    @Override
    public List<FinalOrder> findAll() {
        return finalOrderRepo.findAll();
    }

    @Override
    public Optional<FinalOrder> findById(int id) {
        return finalOrderRepo.findById(id);
    }
}
