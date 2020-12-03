package com.example.demo.restcontroller;

import com.example.demo.model.MovieHall;
import com.example.demo.service.MovieHallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MovieHallRestController {

    @Autowired
    MovieHallServiceImpl movieHallService;

    @Autowired
    public MovieHallRestController(MovieHallServiceImpl theMovieHallService){
        movieHallService = theMovieHallService;
    }

    @GetMapping("/movieHalls")
    public List<MovieHall> findAll(){
        return movieHallService.findAll();
    }

    @GetMapping("/movieHall/{movieHallId}")
    public Optional<MovieHall> getMovieHall(@PathVariable int movieHallId){
        Optional<MovieHall> movieHall = movieHallService.findById(movieHallId);

        if (movieHall == null){
            throw new RuntimeException("Movie Hall id not found - " + movieHallId);
        }

        return movieHall;
    }

    @PostMapping("/movieHall")
    public MovieHall addMovieHall(@RequestBody MovieHall movieHall){

        movieHall.setId(0);

        movieHallService.save(movieHall);

        return movieHall;
    }

    @PutMapping("/movieHall")
    public MovieHall updateMovieHall(@RequestBody MovieHall movieHall){

        movieHallService.save(movieHall);

        return movieHall;
    }

    @DeleteMapping("/movieHall/{movieHallId}")
    public String deleteMovieHall(@PathVariable int movieHallId){
        Optional<MovieHall> tempMovieHall = movieHallService.findById(movieHallId);

        if (tempMovieHall == null){
            throw new RuntimeException("Movie Hall id not found - " + movieHallId);

        }

        movieHallService.deleteById(movieHallId);

        return "Deleted movie hall id - " + movieHallId;
    }
}
