package com.simulation.demo.services.schedule.dto;

import java.util.List;

import com.simulation.demo.domain.Game;

public class ScheduleDto {
	
	private Long id;
	
	private List<Game> games;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	
}
