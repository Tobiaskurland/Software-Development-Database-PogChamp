package com.example.demo.restcontroller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    @Autowired
    MovieServiceImpl movieService;

    @Autowired
    public MovieRestController(MovieServiceImpl theMovieService){
        movieService = theMovieService;
    }

    @GetMapping("/movies")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/movie/{movieId}")
    public Optional<Movie> getMovie(@PathVariable int movieId){

        Optional<Movie> movie = movieService.findById(movieId);

        if (movie == null){
            throw new RuntimeException("movie id not found - "  + movie);
        }

        return movie;
    }

    @PostMapping("/movie")
    public Movie addMovie(@RequestBody Movie movie){

        movie.setId(0);

        movieService.save(movie);

        return movie;
    }

    @PutMapping("/movie")
    public Movie updateMovie(@RequestBody Movie movie){

        movieService.save(movie);

        return movie;
    }

    @DeleteMapping("/movie/{movieId}")
    public String deleteMovie(@PathVariable int movieId){
        Optional<Movie> tempMovie = movieService.findById(movieId);

        if (tempMovie == null){
            throw new RuntimeException("Movie id not found - " + movieId);
        }

        movieService.deleteById(movieId);

        return "Deleted movie id - " + movieId;
    }

}
