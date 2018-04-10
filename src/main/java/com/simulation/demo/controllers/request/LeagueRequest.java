package com.simulation.demo.controllers.request;

public class LeagueRequest {
	
private Long id;
	
	public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public char getName() {
	return name;
}

public void setName(char name) {
	this.name = name;
}

public int getDivision() {
	return division;
}

public void setDivision(int division) {
	this.division = division;
}

	private char name;
	
	private int division;

}
