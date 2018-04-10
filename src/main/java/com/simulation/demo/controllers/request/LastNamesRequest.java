package com.simulation.demo.controllers.request;

import javax.validation.constraints.NotNull;

public class LastNamesRequest {

	private Long id;

	@NotNull
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
