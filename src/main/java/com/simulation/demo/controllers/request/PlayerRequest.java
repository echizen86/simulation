package com.simulation.demo.controllers.request;

import com.simulation.demo.domain.StatsPhysical;
import com.simulation.demo.domain.Team;

public class PlayerRequest {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String nationality;
	
	private StatsPhysical stats;
	
	private Team team;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public StatsPhysical getStats() {
		return stats;
	}

	public void setStats(StatsPhysical stats) {
		this.stats = stats;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
