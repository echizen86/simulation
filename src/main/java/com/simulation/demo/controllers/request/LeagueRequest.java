package com.simulation.demo.controllers.request;

public class LeagueRequest {

	private char name;

	private int division;

	public int getDivision() {
		return division;
	}

	public char getName() {
		return name;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public void setName(char name) {
		this.name = name;
	}

}
