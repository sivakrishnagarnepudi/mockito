package com.cpstech.movies.repository;

import com.cpstech.movies.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInterface extends JpaRepository<Movies,Integer> {
     Movies findByMovieName(String name);
}
