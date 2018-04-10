package com.simulation.demo.controllers.request;

import javax.validation.constraints.NotNull;

public class NamesRequest {

	private Long id;

	@NotNull
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String lastName) {
		this.name = lastName;
	}

}
