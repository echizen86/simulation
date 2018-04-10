package com.simulation.demo.services.team.assembler;

import com.simulation.demo.domain.Team;
import com.simulation.demo.services.team.dto.TeamDto;

public class TeamAssembler {
	
	public static TeamDto fromTeam(Team team) {
		TeamDto t = new TeamDto();
		t.setBudget(team.getBudget());
		t.setName(team.getName());
		t.setPlayers(team.getPlayers());
		
		return t;
	}

}
