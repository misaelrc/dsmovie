package com.example.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsmovie.Entities.Score;
import com.example.dsmovie.Entities.ScorePK;

public interface  ScoreRepository extends JpaRepository<Score, ScorePK>{

}
