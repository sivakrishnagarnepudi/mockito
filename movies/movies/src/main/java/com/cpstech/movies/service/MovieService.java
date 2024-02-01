package com.cpstech.movies.service;

import com.cpstech.movies.model.Movies;
import com.cpstech.movies.repository.MovieInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieInterface movieInterface;
    public Movies addMovie(Movies movies){
        return movieInterface.save(movies);
    }
    public List<Movies> addMovies(List<Movies>  movies){
        return movieInterface.saveAll(movies);
    }
    public Movies getMovieById(int id){
        return movieInterface.findById(id).orElse(null);
    }
    public List<Movies> getMovies(List<Movies> movies){
        return movieInterface.findAll();
    }
    public Movies getMovieByName(String  name){
        return movieInterface.findByMovieName(name);
    }
    public Movies upDateMovie(Movies movie){
        Movies existingMovie=movieInterface.findById(movie.getId()).orElse(null);
        existingMovie.setMovieName(movie.getMovieName());
        existingMovie.setDirector(movie.getDirector());
        existingMovie.setDuration(movie.getDuration());
        return existingMovie;
    }
    public String deleteMove(int id){
    movieInterface.deleteById(id);
        return "DELETED";
    }
}
