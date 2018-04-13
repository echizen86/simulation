package com.simulation.demo.services.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.StatsRequest;
import com.simulation.demo.domain.StatsPhysical;
import com.simulation.demo.services.stats.assembler.StatsAssembler;
import com.simulation.demo.services.stats.dto.StatsDto;
import com.simulation.demo.services.stats.repository.StatsRepository;
import com.simulation.demo.services.stats.service.StatsService;

@Service
public class StatsServiceImpl implements StatsService {

	@Autowired
	private StatsRepository statsRepository;

	@Override
	public StatsDto addStats(StatsRequest stats) {
		StatsPhysical s = new StatsPhysical();
		s.setConnection(stats.getConnection());
		s.setField(stats.getField());
		s.setPitchControl(stats.getPitchControl());
		s.setPitchCurve(stats.getPitchCurve());
		s.setPitchStraight(stats.getPitchStraight());
		s.setPowerBat(stats.getPowerBat());
		s.setPowerShoot(stats.getPowerShoot());
		s.setSpeed(stats.getSpeed());
		s.setStamina(stats.getStamina());

		statsRepository.save(s);

		return StatsAssembler.fromStats(s);
	}

	@Override
	public StatsPhysical CreateStatsOFF(int division) {
		StatsPhysical s = new StatsPhysical();

		// MAX = 18, MIN = 8
		if (division == 1) {
			s.setConnection((int) ((Math.random() * 8) + 1) + 10);
			s.setField((int) ((Math.random() * 8) + 1) + 10);
			s.setPowerBat((int) ((Math.random() * 8) + 1) + 10);
			s.setPowerShoot((int) ((Math.random() * 8) + 1) + 10);
			s.setSpeed((int) ((Math.random() * 8) + 1) + 10);
			s.setStamina((int) ((Math.random() * 8) + 1) + 10);

			// STATS FOR PITCHER IS LOWER
			s.setPitchControl((int) ((Math.random() * 6) + 1));
			s.setPitchCurve((int) ((Math.random() * 6) + 1));
			s.setPitchStraight((int) ((Math.random() * 6) + 1));
		}

		// MAX = 15, MIN = 7
		if (division == 2) {
			s.setConnection((int) ((Math.random() * 7) + 1) + 8);
			s.setField((int) ((Math.random() * 7) + 1) + 8);
			s.setPowerBat((int) ((Math.random() * 7) + 1) + 8);
			s.setPowerShoot((int) ((Math.random() * 7) + 1) + 8);
			s.setSpeed((int) ((Math.random() * 7) + 1) + 8);
			s.setStamina((int) ((Math.random() * 7) + 1) + 8);

			// STATS FOR PITCHER IS LOWER
			s.setPitchControl((int) ((Math.random() * 5) + 1));
			s.setPitchCurve((int) ((Math.random() * 5) + 1));
			s.setPitchStraight((int) ((Math.random() * 5) + 1));
		}

		if (division > 2) {
			int max = 30 / division + 3;
			int min = 0, minP = 0;
			if ((max - 7) > 0)
				min = max - 7;
			if ((5 - division) > 0)
				minP = 5 - division;

			s.setConnection((int) ((Math.random() * max) + min));
			s.setField((int) ((Math.random() * max) + min));
			s.setPowerBat((int) ((Math.random() * max) + min));
			s.setPowerShoot((int) ((Math.random() * max) + min));
			s.setSpeed((int) ((Math.random() * max) + min));
			s.setStamina((int) ((Math.random() * max) + min));

			// STATS FOR PITCHER IS LOWER
			s.setPitchControl((int) ((Math.random() * 3) + minP));
			s.setPitchCurve((int) ((Math.random() * 3) + minP));
			s.setPitchStraight((int) ((Math.random() * 3) + minP));
		}
		
		statsRepository.save(s);
		
		return s;
	}

	@Override
	public StatsPhysical CreateStatsPitcher(int division) {
		StatsPhysical s = new StatsPhysical();

		// MAX = 18, MIN = 8
		if (division == 1) {
			s.setPitchControl((int) ((Math.random() * 8) + 1) + 10);
			s.setPitchCurve((int) ((Math.random() * 8) + 1) + 10);
			s.setPitchStraight((int) ((Math.random() * 8) + 1) + 10);

			// STATS FOR OFF IS LOWER
			s.setConnection((int) ((Math.random() * 6) + 1));
			s.setField((int) ((Math.random() * 6) + 1));
			s.setPowerBat((int) ((Math.random() * 6) + 1));
			s.setPowerShoot((int) ((Math.random() * 6) + 1));
			s.setSpeed((int) ((Math.random() * 6) + 1));
			s.setStamina((int) ((Math.random() * 6) + 1));
		}

		// MAX = 15, MIN = 7
		if (division == 2) {
			s.setPitchControl((int) ((Math.random() * 7) + 8));
			s.setPitchCurve((int) ((Math.random() * 7) + 8));
			s.setPitchStraight((int) ((Math.random() * 7) + 8));

			// STATS FOR OFF IS LOWER
			s.setConnection((int) ((Math.random() * 5) + 1) + 1);
			s.setField((int) ((Math.random() * 5) + 1) + 1);
			s.setPowerBat((int) ((Math.random() * 5) + 1) + 1);
			s.setPowerShoot((int) ((Math.random() * 5) + 1) + 1);
			s.setSpeed((int) ((Math.random() * 5) + 1) + 1);
			s.setStamina((int) ((Math.random() * 5) + 1) + 1);
		}

		if (division > 2) {
			int max = 30 / division + 3;
			int min = 0, minO = 0;
			if ((max - 7) > 0)
				min = max - 7;
			if ((5 - division) > 0)
				minO = 5 - division;

			s.setPitchControl((int) ((Math.random() * max) + min));
			s.setPitchCurve((int) ((Math.random() * max) + min));
			s.setPitchStraight((int) ((Math.random() * max) + min));

			// STATS FOR OFF IS LOWER
			s.setConnection((int) ((Math.random() * 3) + minO));
			s.setField((int) ((Math.random() * 3) + minO));
			s.setPowerBat((int) ((Math.random() * 3) + minO));
			s.setPowerShoot((int) ((Math.random() * 3) + minO));
			s.setSpeed((int) ((Math.random() * 3) + minO));
			s.setStamina((int) ((Math.random() * 3) + minO));
		}

		statsRepository.save(s);
		
		return s;
	}

}
