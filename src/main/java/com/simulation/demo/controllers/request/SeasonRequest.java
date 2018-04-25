package com.simulation.demo.controllers.request;

import com.simulation.demo.domain.Schedule;

public class SeasonRequest {
	
	private Long id;
	
	private int number;
	
	private Schedule schedule;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	

}
