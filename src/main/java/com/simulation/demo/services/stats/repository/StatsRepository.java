package com.simulation.demo.services.stats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Stasts;

@Repository
public interface StatsRepository extends CrudRepository<Stasts, Long>{

}
