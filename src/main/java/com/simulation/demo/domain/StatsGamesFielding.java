package com.simulation.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats_fielding")
public class StatsGamesFielding {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "game")
	private int game;
	
	@Column(name = "inning_field")
	private float inningField;
	
	@Column(name = "total_chances")
	private int totalChances;
	
	@Column(name = "put_out")
	private int putOut;
	
	@Column(name = "error")
	private int error;
	
	@Column(name = "stolen_base")
	private int stolenBaseAllowed;
	
	@Column(name = "caught_stolen")
	private int stolenBaseCaught;
	
	public int getAVE() {
		return (int)(this.getPutOut()/(this.getPutOut()+this.error));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public float getInningField() {
		return inningField;
	}

	public void setInningField(float inningField) {
		this.inningField = inningField;
	}

	public int getTotalChances() {
		return totalChances;
	}

	public void setTotalChances(int totalChances) {
		this.totalChances = totalChances;
	}

	public int getPutOut() {
		return putOut;
	}

	public void setPutOut(int putOut) {
		this.putOut = putOut;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public int getStolenBaseAllowed() {
		return stolenBaseAllowed;
	}

	public void setStolenBaseAllowed(int stolenBaseAllowed) {
		this.stolenBaseAllowed = stolenBaseAllowed;
	}

	public int getStolenBaseCaught() {
		return stolenBaseCaught;
	}

	public void setStolenBaseCaught(int stolenBaseCaught) {
		this.stolenBaseCaught = stolenBaseCaught;
	}

	@Override
	public String toString() {
		return "PlayerGamesFielding [id=" + id + ", game=" + game + ", inningField=" + inningField + ", totalChances="
				+ totalChances + ", putOut=" + putOut + ", error=" + error + ", stolenBaseAllowed=" + stolenBaseAllowed
				+ ", stolenBaseCaught=" + stolenBaseCaught + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + error;
		result = prime * result + game;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Float.floatToIntBits(inningField);
		result = prime * result + putOut;
		result = prime * result + stolenBaseAllowed;
		result = prime * result + stolenBaseCaught;
		result = prime * result + totalChances;
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
		StatsGamesFielding other = (StatsGamesFielding) obj;
		if (error != other.error)
			return false;
		if (game != other.game)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Float.floatToIntBits(inningField) != Float.floatToIntBits(other.inningField))
			return false;
		if (putOut != other.putOut)
			return false;
		if (stolenBaseAllowed != other.stolenBaseAllowed)
			return false;
		if (stolenBaseCaught != other.stolenBaseCaught)
			return false;
		if (totalChances != other.totalChances)
			return false;
		return true;
	}
	
}
