package com.simulation.demo.services.game.assembler;

import com.simulation.demo.domain.Game;
import com.simulation.demo.services.game.dto.GameDto;

public class GameAssembler {

	public static GameDto fromGame(Game game) {
		GameDto g = new GameDto();
		g.setId(game.getId());
		g.setDate(game.getDate());
		g.setHome(game.getHome());
		g.setHomeruns(game.getHomeruns());
		g.setInnings(game.getInnings());
		g.setPitcherLoser(game.getPitcherLoser());
		g.setPitcherSaver(game.getPitcherSaver());
		g.setPitcherWinner(game.getPitcherWinner());
		g.setVisitor(game.getVisitor());
		
		return g;
	}
}
