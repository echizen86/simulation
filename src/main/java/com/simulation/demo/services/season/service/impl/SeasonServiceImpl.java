package com.simulation.demo.services.season.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Season;
import com.simulation.demo.services.league.repository.LeagueRepository;
import com.simulation.demo.services.schedule.service.ScheduleService;
import com.simulation.demo.services.season.assembler.SeasonAssembler;
import com.simulation.demo.services.season.dto.SeasonDto;
import com.simulation.demo.services.season.repository.SeasonRepository;
import com.simulation.demo.services.season.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonRepository seasonRepository;

	@Autowired
	private ScheduleService scheduleService;
	
	@Autowired
	private LeagueRepository leagueRepository;

	@Override
	public SeasonDto createSeason(Season season, Date startDate, League league) {
		Season s = new Season();
		s.setNumber(season.getNumber());
		League l = new League();
		l = leagueRepository.findByName(league.getName());
		s.setSchedule(scheduleService.createSchedule(startDate, l));

		seasonRepository.save(s);

		return SeasonAssembler.fromSeason(s);
	}
	
	@Override
	public Season findByNumber(int number) {
		return seasonRepository.findByNumber(number);
	}

}
