package com.example.demo.restcontroller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Optional<Customer> getCustomer(@PathVariable int customerId){
        Optional<Customer> theCustomer = customerService.findById(customerId);

        if (theCustomer == null){
            throw new RuntimeException("Employee id not found - " + customerId);
        }

        return theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){

        theCustomer.setId(0);

        customerService.save(theCustomer);

        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){

        customerService.save(theCustomer);

        return theCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        Optional<Customer> tempCustomer = customerService.findById(customerId);

        if (tempCustomer == null){
            throw new RuntimeException("Employee id not found - " + customerId);
        }

        customerService.deleteById(customerId);

        return "Deleted employee id - " + customerId;


    }


}
