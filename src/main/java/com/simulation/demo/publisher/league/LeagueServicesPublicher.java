package com.simulation.demo.publisher.league;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.services.league.dto.LeagueDto;

public interface LeagueServicesPublicher {

	public LeagueDto addLeague(LeagueRequest league);

}
