package com.example.demo.restcontroller;

import com.example.demo.model.Genre;
import com.example.demo.service.GenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GenreRestController {

    @Autowired
    GenreServiceImpl genreEntityService;

    @Autowired
    public GenreRestController(GenreServiceImpl theGenreEntityService){
        genreEntityService = theGenreEntityService;
    }

    @GetMapping("/genres")
    public List<Genre> findAll(){
        return genreEntityService.findAll();
    }

    @GetMapping("/genre/{genreId}")
    public Optional<Genre> getGenre(@PathVariable int genreId){
        Optional<Genre> theGenre = genreEntityService.findById(genreId);

        if (theGenre == null){
            throw new RuntimeException("Genre id not  found - " + theGenre);
        }

        return theGenre;
    }

    @PostMapping("/genre")
    public Genre addGenre(@RequestBody Genre theGenre){

        theGenre.setId(0);

        genreEntityService.save(theGenre);

        return theGenre;
    }

    @PutMapping("/genre")
    public Genre updateGenre(@RequestBody Genre theGenre){

        genreEntityService.save(theGenre);

        return theGenre;
    }

    @DeleteMapping("/genre/{genreId}")
    public String deleteGenre(@PathVariable int genreId){
        Optional<Genre> tempGenre = genreEntityService.findById(genreId);

        if (tempGenre == null){
            throw new RuntimeException("Genre id not found - " + genreId);
        }

        genreEntityService.deleteById(genreId);

        return "Deleted genre id - " +  genreId;
    }

}
