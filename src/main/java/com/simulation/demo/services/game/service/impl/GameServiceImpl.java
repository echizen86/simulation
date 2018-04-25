package com.simulation.demo.services.game.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.domain.Game;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.game.repository.GameRepository;
import com.simulation.demo.services.game.service.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameRepository gameRepository;
	
	@Override
	public Game createGame(Team visitor, Team home, Date date) {
		Game g = new Game();
		
		g.setDate(date);
		g.setHome(home);
		g.setVisitor(visitor);
		
		gameRepository.save(g);
		
		return g;
	}

}
