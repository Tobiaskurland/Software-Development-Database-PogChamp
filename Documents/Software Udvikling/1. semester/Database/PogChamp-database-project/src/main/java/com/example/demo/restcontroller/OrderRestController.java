package com.example.demo.restcontroller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderRestController {

    @Autowired
    OrderServiceImpl orderService;

    @Autowired
    public OrderRestController(OrderServiceImpl theOrderService){
        orderService = theOrderService;
    }

    @GetMapping("/orders")
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @GetMapping("/order/{orderId}")
    public Optional<Order> getOrder(@PathVariable int orderId){
        Optional<Order> order = orderService.findById(orderId);


        return order;
    }

    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order){

        order.setId(0);

        orderService.save(order);

        return order;
    }

    @PutMapping("/order")
    public Order updateOrder(@RequestBody Order order){

        orderService.save(order);

        return order;
    }

    @DeleteMapping("/order/{orderId}")
    public String deleteOrder(@PathVariable int orderId){

        Optional<Order> tempOrder = orderService.findById(orderId);

        if (tempOrder == null){
            throw new RuntimeException("Order id not found - " + orderId);
        }

        orderService.deleteById(orderId);

        return "Order id deleted - " + orderId;
    }
}
