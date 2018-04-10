package com.simulation.demo.services.team.service;

import com.simulation.demo.controllers.request.TeamRequest;
import com.simulation.demo.services.team.dto.TeamDto;

public interface TeamService {

	TeamDto addTeam(TeamRequest team);

}
