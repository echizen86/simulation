package com.simulation.demo.services.schedule.assembler;

import com.simulation.demo.domain.Schedule;
import com.simulation.demo.services.schedule.dto.ScheduleDto;

public class ScheduleAssembler {
	
	public static ScheduleDto fromSchedule(Schedule schedule) {
		ScheduleDto s = new ScheduleDto();
		s.setId(schedule.getId());
		s.setGames(schedule.getGames());
		
		return s;
	}

}
