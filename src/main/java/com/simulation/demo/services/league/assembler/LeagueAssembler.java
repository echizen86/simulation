package com.simulation.demo.services.league.assembler;

import com.simulation.demo.domain.League;
import com.simulation.demo.services.league.dto.LeagueDto;

public class LeagueAssembler {
	
	public static LeagueDto fromLeague(League league) {
		LeagueDto l = new LeagueDto();
		l.setId(league.getId());
		l.setName(league.getName());
		l.setDivision(league.getDivision());
		
		return l;
	}

}
