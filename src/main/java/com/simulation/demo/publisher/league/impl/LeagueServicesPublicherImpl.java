package com.simulation.demo.publisher.league.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.controllers.request.SeasonRequest;
import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Season;
import com.simulation.demo.domain.Team;
import com.simulation.demo.publisher.league.LeagueServicesPublicher;
import com.simulation.demo.services.league.assembler.LeagueAssembler;
import com.simulation.demo.services.league.dto.LeagueDto;
import com.simulation.demo.services.league.service.LeagueService;
import com.simulation.demo.services.season.dto.SeasonDto;
import com.simulation.demo.services.season.service.SeasonService;
import com.simulation.demo.services.team.service.TeamService;

@Service
public class LeagueServicesPublicherImpl implements LeagueServicesPublicher {

	@Autowired
	private LeagueService leagueService;

	@Autowired
	private TeamService teamService;
	
	
	@Autowired
	private SeasonService seasonService;

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
	
	@Transactional
	@Override
	public SeasonDto addSeason(int season, String startDate, Long league) {
		Season s = new Season();
		s.setNumber(season);
		
		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		
		Date d = new Date();
		try {
			d = f.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		League l = new League();
		l = leagueService.findById(league);
		
		return 	seasonService.createSeason(s, d, l);
		
	}

}
