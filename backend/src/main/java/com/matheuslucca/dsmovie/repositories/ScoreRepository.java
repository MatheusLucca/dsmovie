package com.matheuslucca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslucca.dsmovie.entities.Score;
import com.matheuslucca.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
