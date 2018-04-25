package com.simulation.demo.services.schedule.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.domain.Game;
import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Schedule;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.game.service.GameService;
import com.simulation.demo.services.schedule.repository.ScheduleRepository;
import com.simulation.demo.services.schedule.service.ScheduleService;
import com.simulation.demo.services.team.service.TeamService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private GameService gameService;

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Schedule createSchedule(Date startDate, League league) {
		Schedule s = new Schedule();

		List<Game> games = new ArrayList<>();

		List<List<Team>> list = new ArrayList<List<Team>>();

		for (int i = 0; i < 16; i++) {
			list.add((List<Team>) teamService.getAll());
		}

		int daysH = 0;
		int daysV = 105;
		
		Calendar c = Calendar.getInstance();
		
		for (int i = 0; i < 16; i++) {
			for (int j = i + 1; j < 16; j++) {
				// Create 6 games with the same teams but different dates
				c.setTime(startDate);
				c.set(Calendar.DAY_OF_YEAR, daysH);
				Game g = gameService.createGame(list.get(i).get(j), list.get(i).get(i), c.getTime());
				games.add(g);
				c.set(Calendar.DAY_OF_YEAR, daysH+1);
				Game g1 = gameService.createGame(list.get(i).get(j), list.get(i).get(i),c.getTime());
				games.add(g1);
				c.set(Calendar.DAY_OF_YEAR, daysH+2);
				Game g2 = gameService.createGame(list.get(i).get(j), list.get(i).get(i), c.getTime());
				games.add(g2);
				daysH += 7;
				
				c.setTime(startDate);
				c.set(Calendar.DAY_OF_YEAR, daysV);
				Game g3 = gameService.createGame(list.get(i).get(j), list.get(i).get(i), c.getTime());
				games.add(g3);
				c.set(Calendar.DAY_OF_YEAR, daysV-1);
				Game g4 = gameService.createGame(list.get(i).get(j), list.get(i).get(i), c.getTime());
				games.add(g4);
				c.set(Calendar.DAY_OF_YEAR, daysV-2);
				Game g5 = gameService.createGame(list.get(i).get(j), list.get(i).get(i),c.getTime());
				games.add(g5);
				daysV -= 7;
			}
		}
		
		s.setGames(games);
		
		scheduleRepository.save(s);
		
		return s;
	}
}
