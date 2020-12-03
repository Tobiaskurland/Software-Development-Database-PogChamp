package com.example.demo.service;

import com.example.demo.model.Genre;
import com.example.demo.repository.IGenreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements IGenreService {

    @Autowired
    private IGenreRepo genreEntityRepo;

    @Autowired
    public GenreServiceImpl(IGenreRepo theGenreEntityRepo){
        genreEntityRepo = theGenreEntityRepo;
    }

    @Override
    public List<Genre> findAll() {
        return genreEntityRepo.findAll();
    }

    @Override
    public Optional<Genre> findById(int theId) {
        return genreEntityRepo.findById(theId);
    }

    @Override
    public void save(Genre theGenre) {
        genreEntityRepo.save(theGenre);

    }

    @Override
    public void deleteById(int theId) {
        genreEntityRepo.deleteById(theId);

    }
}
