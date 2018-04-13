package com.simulation.demo.services.team.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.TeamRequest;
import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.player.service.PlayerService;
import com.simulation.demo.services.team.assembler.TeamAssembler;
import com.simulation.demo.services.team.dto.TeamDto;
import com.simulation.demo.services.team.repository.TeamRepository;
import com.simulation.demo.services.team.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private PlayerService playerService;

	@Override
	public TeamDto addTeam(TeamRequest team) {
		Team t = new Team();
		t.setBudget(team.getBudget());
		t.setName(team.getName());
		t.setPlayers(team.getPlayers());

		teamRepository.save(t);

		return TeamAssembler.fromTeam(t);
	}

	@Override
	public Team CreateTeamsNew(League l, int num) {
		Team t = new Team();

		t.setName("Team " + num);
		t.setBudget(100000);
		t.setLeague(l);
		
		t.setPlayers(playerService.CreatePlayersNew(t, l.getDivision()));
		
		teamRepository.save(t);

		return t;
	}
	
}
