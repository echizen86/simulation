package com.simulation.demo.services.game.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long>{

}
