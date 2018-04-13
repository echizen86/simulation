package com.simulation.demo.controllers.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.simulation.demo.domain.Player;

public class TeamRequest {

	private Long id;

	@NotNull
	private String name;

	@NotNull
	private int budget;

	private List<Player> players;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
