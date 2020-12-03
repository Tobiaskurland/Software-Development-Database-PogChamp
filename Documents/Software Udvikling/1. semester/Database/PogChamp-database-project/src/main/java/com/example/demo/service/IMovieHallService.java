package com.example.demo.service;

import com.example.demo.model.MovieHall;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IMovieHallService {

    public List<MovieHall> findAll();

    public Optional<MovieHall> findById(int id);

    public void save(MovieHall movieHall);

    public void deleteById(int id);
}
