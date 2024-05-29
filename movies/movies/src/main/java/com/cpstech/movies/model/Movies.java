package com.cpstech.movies.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "movies_data")
public class Movies {
    @Id
    @GeneratedValue
    private int id;

    private String movieName;
    private double duration;
    private String director;

    public List<MovieDetails> getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(List<MovieDetails> movieDetails) {
        this.movieDetails = movieDetails;
    }

    @OneToMany(mappedBy ="movies",cascade = CascadeType.ALL)
    public List<MovieDetails> movieDetails=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
