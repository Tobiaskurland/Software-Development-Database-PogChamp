package com.example.demo.restcontroller;

import com.example.demo.model.OrderItems;
import com.example.demo.service.OrderItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderItemRestController {

    @Autowired
    OrderItemServiceImpl orderItemService;

    @Autowired
    public OrderItemRestController(OrderItemServiceImpl theOrderItemService){
        orderItemService = theOrderItemService;
    }

    @GetMapping("/orderItems")
    public List<OrderItems> findAll(){
        return orderItemService.findAll();
    }

    @GetMapping("/orderItem/{orderItemId}")
    public Optional<OrderItems> getOrderItem(@PathVariable int orderItemId){
        Optional<OrderItems> orderItem = orderItemService.findById(orderItemId);

        if (orderItem == null){
            throw new RuntimeException("Order item id not found - " + orderItemId);
        }

        return orderItem;
    }

    @PostMapping("/orderItem")
    public OrderItems getOrderItem(@RequestBody OrderItems orderItem){

        orderItem.setId(0);

        orderItemService.save(orderItem);

        return orderItem;
    }

    @PutMapping("/orderItem")
    public OrderItems updateOrderItem(@RequestBody OrderItems orderItem){

        orderItemService.save(orderItem);

        return orderItem;
    }

    @DeleteMapping("/orderItem/{orderItemId}")
    public String deleteOrderItem(@PathVariable int orderItemId){
        Optional<OrderItems> tempOrderItem = orderItemService.findById(orderItemId);

        if (tempOrderItem == null){
            throw new RuntimeException("Order item id not found - " + orderItemId);
        }

        orderItemService.deleteById(orderItemId);

        return "Order Item id deleted - " + orderItemId;
    }

}
