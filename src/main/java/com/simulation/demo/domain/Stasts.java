package com.simulation.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "stats")
public class Stasts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@NotNull
	@Column(name = "power_bat")
	private int powerBat;
	@NotNull
	@Column(name = "connection")
	private int connection;
	@NotNull
	@Column(name = "speed")
	private int speed;
	@NotNull
	@Column(name = "field")
	private int field;
	@NotNull
	@Column(name = "power_shoot")
	private int powerShoot;
	@NotNull
	@Column(name = "pitch_straight")
	private int pitchStraight;
	@NotNull
	@Column(name = "pitch_curve")
	private int pitchCurve;
	@NotNull
	@Column(name = "pitch_control")
	private int pitchControl;
	@NotNull
	@Column(name = "stamina")
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
		Stasts other = (Stasts) obj;
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
	@Override
	public String toString() {
		return "Stasts [id=" + id + ", powerBat=" + powerBat + ", connection=" + connection + ", speed=" + speed
				+ ", field=" + field + ", powerShoot=" + powerShoot + ", pitchStraight=" + pitchStraight
				+ ", pitchCurve=" + pitchCurve + ", pitchControl=" + pitchControl + ", stamina=" + stamina + "]";
	}
	
	

}
