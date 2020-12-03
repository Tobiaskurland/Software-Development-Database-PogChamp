package com.example.demo.restcontroller;

import com.example.demo.model.OrderStatus;
import com.example.demo.service.OrderStatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderStatusRestController {

    @Autowired
    OrderStatusServiceImpl orderStatusService;

    @Autowired
    public OrderStatusRestController(OrderStatusServiceImpl theOrderStatusService){
        orderStatusService = theOrderStatusService;
    }

    @GetMapping("/orderStatuses")
    public List<OrderStatus> findAll(){
        return orderStatusService.findAll();
    }

    @GetMapping("/orderStatus/{orderStatusId}")
    public Optional<OrderStatus> getOrderStatus(@PathVariable int orderStatusId){
        Optional<OrderStatus> orderStatus = orderStatusService.findById(orderStatusId);

        if (orderStatus == null){
            throw new RuntimeException("Order Status id not found - " + orderStatusId);
        }

        return orderStatus;
    }

    @PostMapping("/orderStatus")
    public OrderStatus addOrderStatus(@RequestBody OrderStatus orderStatus){

        orderStatus.setId(0);

        orderStatusService.save(orderStatus);

        return orderStatus;
    }

    @PutMapping("/orderStatus")
    public OrderStatus updateOrderStatus(@RequestBody OrderStatus orderStatus){

        orderStatusService.save(orderStatus);

        return orderStatus;
    }

    @DeleteMapping("orderStatus/{orderStatusId}")
    public String deleteOrderStatus(@PathVariable int orderStatusId){
        Optional<OrderStatus> tempOrderStatus = orderStatusService.findById(orderStatusId);

        if (tempOrderStatus == null){
            throw new RuntimeException("Order Status id not found - " + orderStatusId);
        }

        orderStatusService.delete(orderStatusId);

        return "Order Status id deleted - " + orderStatusId;
    }

}
