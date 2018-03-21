package com.simulation.demo.services.role.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
