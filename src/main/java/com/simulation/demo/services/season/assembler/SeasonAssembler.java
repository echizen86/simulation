package com.simulation.demo.services.season.assembler;

import com.simulation.demo.domain.Season;
import com.simulation.demo.services.season.dto.SeasonDto;

public class SeasonAssembler {
	
	public static SeasonDto fromSeason(Season season) {
		SeasonDto s = new SeasonDto();
		s.setId(season.getId());
		s.setNumber(season.getNumber());
		s.setSchedule(season.getSchedule());
		
		return s;
	}

}
