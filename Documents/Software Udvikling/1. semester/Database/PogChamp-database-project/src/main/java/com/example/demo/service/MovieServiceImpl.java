package com.example.demo.service;


import com.example.demo.model.Movie;
import com.example.demo.repository.IMovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    IMovieRepo movieRepo;

    @Autowired
    public MovieServiceImpl(IMovieRepo theMovieRepo){
        movieRepo = theMovieRepo;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepo.findAll();
    }

    @Override
    public Optional<Movie> findById(int id) {
        return movieRepo.findById(id);
    }

    @Override
    public void save(Movie movie) {

        movieRepo.save(movie);

    }

    @Override
    public void deleteById(int id) {

        movieRepo.deleteById(id);

    }
}
