package com.simulation.demo.controllers.request;

import java.util.List;

import com.simulation.demo.domain.Team;

public class LeagueRequest {
	
	private Long id;

	private char name;

	private int division;

	private List<Team> teams;

	public int getDivision() {
		return division;
	}
	
	public Long getId() {
		return id;
	}

	public char getName() {
		return name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(char name) {
		this.name = name;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
