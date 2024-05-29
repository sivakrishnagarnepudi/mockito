package com.cpstech.movies.model;

import jakarta.persistence.*;

@Entity
@Table
public class MovieDetails {
    @Id
    @GeneratedValue
    private int id;
    private String hero;
    private String heroin;
    private String comdian;
    private String villan;



    @ManyToOne()
    private Movies movies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroin() {
        return heroin;
    }

    public void setHeroin(String heroin) {
        this.heroin = heroin;
    }

    public String getComdian() {
        return comdian;
    }

    public void setComdian(String comdian) {
        this.comdian = comdian;
    }

    public String getVillan() {
        return villan;
    }

    public void setVillan(String villan) {
        this.villan = villan;
    }
    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
