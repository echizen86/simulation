package com.simulation.demo.services.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.StatsRequest;
import com.simulation.demo.domain.Stasts;
import com.simulation.demo.services.stats.assembler.StatsAssembler;
import com.simulation.demo.services.stats.dto.StatsDto;
import com.simulation.demo.services.stats.repository.StatsRepository;
import com.simulation.demo.services.stats.service.StatsService;

@Service
public class StatsServiceImpl implements StatsService{
	
	@Autowired
	private StatsRepository statsRepository;
	
	@Override
	public StatsDto addStats(StatsRequest stats) {
		Stasts s = new Stasts();
		s.setConnection(stats.getConnection());
		s.setField(stats.getField());
		s.setPitchControl(stats.getPitchControl());
		s.setPitchCurve(stats.getPitchCurve());
		s.setPitchStraight(stats.getPitchStraight());
		s.setPowerBat(stats.getPowerBat());
		s.setPowerShoot(stats.getPowerShoot());
		s.setSpeed(stats.getSpeed());
		s.setStamina(stats.getStamina());
		
		statsRepository.save(s);
		
		return StatsAssembler.fromStats(s);
	}

}
