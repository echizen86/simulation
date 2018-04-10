package com.simulation.demo.services.team.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

}
