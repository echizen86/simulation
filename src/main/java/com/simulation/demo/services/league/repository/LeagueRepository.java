package com.simulation.demo.services.league.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long>{

}
