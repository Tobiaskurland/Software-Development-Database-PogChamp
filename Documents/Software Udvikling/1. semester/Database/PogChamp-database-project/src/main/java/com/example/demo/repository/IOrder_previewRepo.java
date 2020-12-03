package com.example.demo.repository;

import com.example.demo.model.OrderPreview;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrder_previewRepo extends CrudRepository<OrderPreview, Long> {

    @Query(value = "Call preview_order()", nativeQuery = true)
    List<OrderPreview> order_preview();
    
}
