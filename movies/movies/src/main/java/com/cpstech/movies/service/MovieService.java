package com.cpstech.movies.service;

import com.cpstech.movies.model.MovieDetails;
import com.cpstech.movies.model.Movies;
import com.cpstech.movies.repository.RepoMovieDetails;
import com.cpstech.movies.repository.RepoMovieInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    RepoMovieInterface repoMovieInterface;
    RepoMovieDetails repoMovieDetails;
    @Autowired
    public MovieService(RepoMovieInterface repoMovieInterface) {
        this.repoMovieInterface = repoMovieInterface;
    }



    /* public List<Movies> getMovies(){
        return repoMovieInterface.findAll();
    }
    public Movies getMovieById(int id){
        return  repoMovieInterface.findById(id).orElse(null);
    }

    public Movies createMovie(Movies movie){
        return repoMovieInterface.save(movie);
    }

    public Movies changeMovie(Movies movie){
        Movies existingMovies = repoMovieInterface.findById(movie.getId()).orElse(null);
        existingMovies.setMovieName(movie.getMovieName());
        existingMovies.setDuration(movie.getDuration());
        existingMovies.setDirector(movie.getDirector());
        return existingMovies;



    }
    public String removeMovie(int id){
        repoMovieInterface.deleteById(id);
        return "s";
    }*/
    public Movies addMovie(Movies movies){

        return repoMovieInterface.save(movies);

    }
    public MovieDetails addMovie(int id,MovieDetails moviesDetails) {
        Movies movies1 = repoMovieInterface.findById(id).orElse(null);
        if (movies1 != null) {
            moviesDetails.setMovies(movies1);
            repoMovieDetails.save(moviesDetails);
            return moviesDetails;
        } else {
            return null;
        }
    }
    public List<MovieDetails> getMovie(int id) {
        Movies movies1 = repoMovieInterface.findById(id).orElse(null);
        if (movies1 != null) {

            return movies1.getMovieDetails();
        } else {
            return null;
        }
    }
    public List<Movies> addMovies(List<Movies>  movies){
        return repoMovieInterface.saveAll(movies);
    }
    public Movies getMovieById(int id){
        return repoMovieInterface.findById(id).orElse(null);
    }
    public List<Movies> getMovies(List<Movies> movies){
        return repoMovieInterface.findAll();
    }
    public Movies getMovieByName(String  name){
        return repoMovieInterface.findByMovieName(name);
    }
    public Movies upDateMovie(Movies movie){
        Movies existingMovie= repoMovieInterface.findById(movie.getId()).orElse(null);
        existingMovie.setMovieName(movie.getMovieName());
        existingMovie.setDirector(movie.getDirector());
        existingMovie.setDuration(movie.getDuration());
        return existingMovie;
    }
    public MovieDetails upDateMovieDetails(MovieDetails movies){
        MovieDetails movies1 = repoMovieDetails.findById(movies.getId()).orElse(null);
        movies1.setComdian(movies.getComdian());
        movies1.setHero(movies.getHero());
        movies1.setHeroin(movies.getHeroin());
        movies1.setVillan(movies.getVillan());
return movies1;
    }

    public Movies createMovie(String movieName, double duration, String director,
                              String hero, String heroine, String comedian, String villain) {
        Movies movie = new Movies();
        movie.setMovieName(movieName);
        movie.setDuration(duration);
        movie.setDirector(director);

        MovieDetails movieDetails = new MovieDetails();
        movieDetails.setHero(hero);
        movieDetails.setHeroin(heroine);
        movieDetails.setVillan(villain);
        movieDetails.setComdian(comedian);
        movieDetails.setMovies(movie);
        movie.getMovieDetails().add(movieDetails);

        return repoMovieInterface.save(movie);
    }


    public String deleteMove(int id){
    repoMovieInterface.deleteById(id);
        return "DELETED";
    }
    public String deleteMoves(int id){
        repoMovieDetails.deleteById(id);
        return "Deleted";
    }
}

