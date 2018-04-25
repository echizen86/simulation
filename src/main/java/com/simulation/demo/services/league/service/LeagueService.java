package com.simulation.demo.services.league.service;

import com.simulation.demo.domain.League;

public interface LeagueService {

	public League addLeague(League league);

	League findById(Long id);

}
