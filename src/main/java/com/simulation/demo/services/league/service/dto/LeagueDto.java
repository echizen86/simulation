package com.simulation.demo.services.league.service.dto;

public class LeagueDto {
	
private Long id;
	
	private char name;

	private int division;

	@Override
	public String toString() {
		return "LeagueDto [id=" + id + ", name=" + name + ", division=" + division + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + division;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + name;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeagueDto other = (LeagueDto) obj;
		if (division != other.division)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name != other.name)
			return false;
		return true;
	}

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

}
