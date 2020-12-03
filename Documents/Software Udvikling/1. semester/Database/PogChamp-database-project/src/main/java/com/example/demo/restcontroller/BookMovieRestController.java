package com.example.demo.restcontroller;

import com.example.demo.model.BookMovie;
import com.example.demo.model.OrderPreview;
import com.example.demo.repository.IOrder_previewRepo;
import com.example.demo.service.BookMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookMovieRestController {

    @Autowired
    BookMovieServiceImpl bookMovieService;

    @Autowired
    IOrder_previewRepo order_preview;

    @Autowired
    public BookMovieRestController(BookMovieServiceImpl theBookMovie, IOrder_previewRepo thePreview){
        bookMovieService = theBookMovie;
        order_preview = thePreview;
    }

    @PostMapping("/bookMovie")
    public BookMovie bookMovie(@RequestBody BookMovie theBody){

        bookMovieService.callStoredProcedure(theBody);

        return theBody;
    }

    @GetMapping("/previewOrder")
    public List<OrderPreview> findAll(){
        return order_preview.order_preview();
    }
}
