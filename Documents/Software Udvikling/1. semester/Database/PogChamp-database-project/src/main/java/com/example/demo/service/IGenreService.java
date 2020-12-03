package com.example.demo.service;

import com.example.demo.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IGenreService {

    public List<Genre> findAll();

    public Optional<Genre> findById(int theId);

    public void save(Genre theGenre);

    public void deleteById(int theId);
}
