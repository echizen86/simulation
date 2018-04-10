package com.simulation.demo.services.player.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Player;

@Repository
public interface PlayerRepository  extends CrudRepository<Player, Long>{

}
