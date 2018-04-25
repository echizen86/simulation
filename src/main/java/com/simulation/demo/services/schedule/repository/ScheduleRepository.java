package com.simulation.demo.services.schedule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulation.demo.domain.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long>{

}
