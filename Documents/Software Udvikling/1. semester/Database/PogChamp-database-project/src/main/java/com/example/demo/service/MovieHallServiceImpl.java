package com.example.demo.service;

import com.example.demo.model.MovieHall;
import com.example.demo.repository.IMovieHallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieHallServiceImpl implements IMovieHallService {

    @Autowired
    IMovieHallRepo movieHallRepo;

    @Autowired
    public MovieHallServiceImpl(IMovieHallRepo theMovieHallRepo){
        movieHallRepo = theMovieHallRepo;
    }

    @Override
    public List<MovieHall> findAll() {
        return movieHallRepo.findAll();
    }

    @Override
    public Optional<MovieHall> findById(int id) {
        return movieHallRepo.findById(id);
    }

    @Override
    public void save(MovieHall movieHall) {
        movieHallRepo.save(movieHall);

    }

    @Override
    public void deleteById(int id) {

        movieHallRepo.deleteById(id);
    }
}
