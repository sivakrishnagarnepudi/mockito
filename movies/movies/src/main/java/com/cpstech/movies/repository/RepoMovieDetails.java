package com.cpstech.movies.repository;

import com.cpstech.movies.model.MovieDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMovieDetails extends JpaRepository<MovieDetails,Integer> {
}
