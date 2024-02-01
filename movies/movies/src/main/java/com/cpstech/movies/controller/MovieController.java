package com.cpstech.movies.controller;

import com.cpstech.movies.model.Movies;
import com.cpstech.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/Movies")
public class MovieController {
    @Autowired
  public   MovieService movieService;
    @PostMapping("/addMovie")
    public Movies addMovie(@RequestBody Movies movies){
        return movieService.addMovie(movies);
    }
    @PostMapping("/addMovies")
    public List<Movies> addMovies(@RequestBody List<Movies> movies){
        return movieService.addMovies(movies);
    }
    @GetMapping("/getMovieById/{id}")
    public Movies getMovieById(@PathVariable int id){
        return movieService.getMovieById(id);
    }
    @GetMapping("/getMovies")
    public List<Movies> getMovies(@PathVariable List<Movies> movies){
        return movieService.getMovies(movies);
    }
    @GetMapping("/getMovieByName/{name}")
    public Movies getMovieByName(@PathVariable String name){
        return movieService.getMovieByName(name);
    }
    @PutMapping("/upDateMovie/{id}")
    public Movies upDateMovie(@RequestBody Movies movies){
        return movieService.upDateMovie(movies);
    }
    @DeleteMapping("/deleteMovie/{id}")
    public  String deleteMovie(@PathVariable int id){
        return  movieService.deleteMove(id);

    }
}
