package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepo customerEntityRepo;

    @Autowired
    public CustomerServiceImpl(ICustomerRepo theEmployeeRepo){
      customerEntityRepo = theEmployeeRepo;
    }

    @Override
    public List<Customer> findAll() {
        return customerEntityRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(int theId) {
        return customerEntityRepo.findById(theId);
    }

    @Override
    public void save(Customer theCustomer) {
        customerEntityRepo.save(theCustomer);

    }

    @Override
    public void deleteById(int theId) {
        customerEntityRepo.deleteById(theId);

    }
}
