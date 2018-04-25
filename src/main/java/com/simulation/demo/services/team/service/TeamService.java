package com.simulation.demo.services.team.service;

import com.simulation.demo.controllers.request.TeamRequest;
import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.team.dto.TeamDto;

public interface TeamService {

	TeamDto addTeam(TeamRequest team);

	Team CreateTeamsNew(League l, int num);

	Iterable<Team> getAll();

}
