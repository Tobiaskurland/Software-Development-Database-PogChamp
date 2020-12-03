package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICustomerService {

    public List<Customer> findAll();

    public Optional<Customer> findById(int theId);

    public void save(Customer theCustomer);

    public void deleteById(int theId);


}
