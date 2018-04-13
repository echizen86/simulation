package com.simulation.demo.controllers.request;

import com.simulation.demo.domain.Role;
import com.simulation.demo.domain.Team;

public class UserRequest {

	private String username;
	private String password;
	private Role role;
	private Team team;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
