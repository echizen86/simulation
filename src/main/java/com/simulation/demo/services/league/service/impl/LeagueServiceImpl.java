package com.simulation.demo.services.league.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.domain.League;
import com.simulation.demo.services.league.repository.LeagueRepository;
import com.simulation.demo.services.league.service.LeagueService;

@Service
public class LeagueServiceImpl  implements LeagueService{
	
	@Autowired
	LeagueRepository leagueReposiroty;

	
	@Override
	public League addLeague(League league) {
		return leagueReposiroty.save(league);
	}
	
	@Override
	public League findById(Long id) {		
		return leagueReposiroty.findById(id).get();
	}

}
