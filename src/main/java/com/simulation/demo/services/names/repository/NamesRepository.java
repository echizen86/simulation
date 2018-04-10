package com.simulation.demo.services.names.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Names;

@Repository
public interface NamesRepository extends CrudRepository<Names, Long>{

}
