package com.example.demo.service;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IMovieService {

    public List<Movie> findAll();

    public Optional<Movie> findById(int id);

    public void save(Movie movie);

    public void deleteById(int id);
}
