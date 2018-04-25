package com.simulation.demo.services.game.service;

import java.util.Date;

import com.simulation.demo.domain.Game;
import com.simulation.demo.domain.Team;

public interface GameService {

	//Game createGame(Team visitor, Team home, Calendar date);

	Game createGame(Team visitor, Team home, Date date);

}
