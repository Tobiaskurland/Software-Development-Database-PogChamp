package com.example.demo.repository;

import com.example.demo.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderStatusRepo extends JpaRepository<OrderStatus, Integer> {

}
