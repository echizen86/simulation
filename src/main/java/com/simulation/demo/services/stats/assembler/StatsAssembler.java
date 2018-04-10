package com.simulation.demo.services.stats.assembler;

import com.simulation.demo.domain.Stasts;
import com.simulation.demo.services.stats.dto.StatsDto;

public class StatsAssembler {

		public static StatsDto fromStats(Stasts stats) {
			StatsDto s = new StatsDto();
			s.setConnection(stats.getConnection());
			s.setField(stats.getField());
			s.setPitchControl(stats.getPitchControl());
			s.setPitchCurve(stats.getPitchCurve());
			s.setPitchStraight(stats.getPitchStraight());
			s.setPowerBat(stats.getPowerBat());
			s.setPowerShoot(stats.getPowerShoot());
			s.setSpeed(stats.getSpeed());
			s.setStamina(stats.getStamina());
			
			return s;
		}
}
