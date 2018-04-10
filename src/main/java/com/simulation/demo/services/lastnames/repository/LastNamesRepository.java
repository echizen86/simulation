package com.simulation.demo.services.lastnames.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.LastNames;

@Repository
public interface LastNamesRepository extends CrudRepository<LastNames, Long>{

}
