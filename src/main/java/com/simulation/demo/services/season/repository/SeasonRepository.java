package com.simulation.demo.services.season.repository;

import org.springframework.data.repository.CrudRepository;

import com.simulation.demo.domain.Season;

public interface SeasonRepository extends CrudRepository<Season, Long>{
	
	Season findByNumber(int number);

}
