package com.simulation.demo.services.stats.dto;

import javax.validation.constraints.NotNull;

public class StatsDto {
	
	private Long id;

	@NotNull
	private int powerBat;
	@NotNull
	private int connection;
	@NotNull
	private int speed;
	@NotNull
	private int field;
	@NotNull
	private int powerShoot;
	@NotNull
	private int pitchStraight;
	@NotNull
	private int pitchCurve;
	@NotNull
	private int pitchControl;
	@NotNull
	private int stamina;
	@Override
	public String toString() {
		return "StatsDto [id=" + id + ", powerBat=" + powerBat + ", connection=" + connection + ", speed=" + speed
				+ ", field=" + field + ", powerShoot=" + powerShoot + ", pitchStraight=" + pitchStraight
				+ ", pitchCurve=" + pitchCurve + ", pitchControl=" + pitchControl + ", stamina=" + stamina + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + connection;
		result = prime * result + field;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + pitchControl;
		result = prime * result + pitchCurve;
		result = prime * result + pitchStraight;
		result = prime * result + powerBat;
		result = prime * result + powerShoot;
		result = prime * result + speed;
		result = prime * result + stamina;
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
		StatsDto other = (StatsDto) obj;
		if (connection != other.connection)
			return false;
		if (field != other.field)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pitchControl != other.pitchControl)
			return false;
		if (pitchCurve != other.pitchCurve)
			return false;
		if (pitchStraight != other.pitchStraight)
			return false;
		if (powerBat != other.powerBat)
			return false;
		if (powerShoot != other.powerShoot)
			return false;
		if (speed != other.speed)
			return false;
		if (stamina != other.stamina)
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPowerBat() {
		return powerBat;
	}
	public void setPowerBat(int powerBat) {
		this.powerBat = powerBat;
	}
	public int getConnection() {
		return connection;
	}
	public void setConnection(int connection) {
		this.connection = connection;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getField() {
		return field;
	}
	public void setField(int field) {
		this.field = field;
	}
	public int getPowerShoot() {
		return powerShoot;
	}
	public void setPowerShoot(int powerShoot) {
		this.powerShoot = powerShoot;
	}
	public int getPitchStraight() {
		return pitchStraight;
	}
	public void setPitchStraight(int pitchStraight) {
		this.pitchStraight = pitchStraight;
	}
	public int getPitchCurve() {
		return pitchCurve;
	}
	public void setPitchCurve(int pitchCurve) {
		this.pitchCurve = pitchCurve;
	}
	public int getPitchControl() {
		return pitchControl;
	}
	public void setPitchControl(int pitchControl) {
		this.pitchControl = pitchControl;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	

}
