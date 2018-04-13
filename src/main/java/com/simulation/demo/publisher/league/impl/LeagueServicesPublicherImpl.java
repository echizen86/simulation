package com.simulation.demo.publisher.league.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Team;
import com.simulation.demo.publisher.league.LeagueServicesPublicher;
import com.simulation.demo.services.league.assembler.LeagueAssembler;
import com.simulation.demo.services.league.dto.LeagueDto;
import com.simulation.demo.services.league.service.LeagueService;
import com.simulation.demo.services.team.service.TeamService;

@Service
public class LeagueServicesPublicherImpl implements LeagueServicesPublicher {

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamService teamService;

	// EACH LEAGUE HAVE 16 TEAM, WE NEED TO CREATE THATS 16 TEAM
	@Transactional
	@Override
	public LeagueDto addLeague(LeagueRequest league) {
		League l = new League();
		l.setName(league.getName());
		l.setDivision(league.getDivision());

		// CREATE THE TEAMS
		for (int i = 0; i < 16; i++) {
			if (l.getTeams()==null) {
				l.setTeams(new ArrayList<Team>());

			}
			l.getTeams().add(teamService.CreateTeamsNew(l, i));

		}

		leagueService.addLeague(l);

		return LeagueAssembler.fromLeague(l);
	}

}
