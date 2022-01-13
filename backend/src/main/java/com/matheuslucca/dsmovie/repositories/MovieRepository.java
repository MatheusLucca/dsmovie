package com.matheuslucca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslucca.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
