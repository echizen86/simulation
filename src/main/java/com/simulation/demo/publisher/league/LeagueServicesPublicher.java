package com.simulation.demo.publisher.league;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.controllers.request.SeasonRequest;
import com.simulation.demo.services.league.dto.LeagueDto;
import com.simulation.demo.services.season.dto.SeasonDto;

public interface LeagueServicesPublicher {

	public LeagueDto addLeague(LeagueRequest league);

	SeasonDto addSeason(int season, String startDate, Long league);

}
