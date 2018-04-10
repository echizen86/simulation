package com.simulation.demo.controllers.request;

import javax.validation.constraints.NotNull;

public class StatsRequest {
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
