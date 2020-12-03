package com.example.demo.repository;

import com.example.demo.model.MovieHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieHallRepo extends JpaRepository<MovieHall, Integer> {

}
