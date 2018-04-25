package com.simulation.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats_hitting")
public class StatsGamesHitting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "game")
	private int game;

	@Column(name = "at_bat")
	private int atBat;

	@Column(name = "run")
	private int run;

	@Column(name = "hit")
	private int hit;

	@Column(name = "doble")
	private int doble;

	@Column(name = "triple")
	private int triple;

	@Column(name = "homerun")
	private int homerun;

	@Column(name = "rbi")
	private int rbi;

	@Column(name = "bb")
	private int bb;

	@Column(name = "strike_out")
	private int strikeOut;

	@Column(name = "stolen_base")
	private int stolenBase;

	@Column(name = "caught_stolen")
	private int caughtStolen;
	
	@Column(name = "hit_by_pitcher")
	public int hitByPitch;

	public int getAVE() {
		return (int) this.getHit() / this.getAtBat();
	}

	public int getSlugging() {
		return (int) (this.getHit() + (this.getDoble() * 2) + (this.getTriple() * 3) + (this.getHomerun() * 4))
				/ this.getAtBat();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHitByPitch() {
		return hitByPitch;
	}

	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public int getAtBat() {
		return atBat;
	}

	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getDoble() {
		return doble;
	}

	public void setDoble(int doble) {
		this.doble = doble;
	}

	public int getTriple() {
		return triple;
	}

	public void setTriple(int triple) {
		this.triple = triple;
	}

	public int getHomerun() {
		return homerun;
	}

	public void setHomerun(int homerun) {
		this.homerun = homerun;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getStrikeOut() {
		return strikeOut;
	}

	public void setStrikeOut(int strikeOut) {
		this.strikeOut = strikeOut;
	}

	public int getStolenBase() {
		return stolenBase;
	}

	public void setStolenBase(int stolenBase) {
		this.stolenBase = stolenBase;
	}

	public int getCaughtStolen() {
		return caughtStolen;
	}

	public void setCaughtStolen(int caughtStolen) {
		this.caughtStolen = caughtStolen;
	}

	@Override
	public String toString() {
		return "StatsGamesHitting [id=" + id + ", game=" + game + ", atBat=" + atBat + ", run=" + run + ", hit=" + hit
				+ ", doble=" + doble + ", triple=" + triple + ", homerun=" + homerun + ", rbi=" + rbi + ", bb=" + bb
				+ ", strikeOut=" + strikeOut + ", stolenBase=" + stolenBase + ", caughtStolen=" + caughtStolen
				+ ", hitByPitch=" + hitByPitch + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atBat;
		result = prime * result + bb;
		result = prime * result + caughtStolen;
		result = prime * result + doble;
		result = prime * result + game;
		result = prime * result + hit;
		result = prime * result + hitByPitch;
		result = prime * result + homerun;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + rbi;
		result = prime * result + run;
		result = prime * result + stolenBase;
		result = prime * result + strikeOut;
		result = prime * result + triple;
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
		StatsGamesHitting other = (StatsGamesHitting) obj;
		if (atBat != other.atBat)
			return false;
		if (bb != other.bb)
			return false;
		if (caughtStolen != other.caughtStolen)
			return false;
		if (doble != other.doble)
			return false;
		if (game != other.game)
			return false;
		if (hit != other.hit)
			return false;
		if (hitByPitch != other.hitByPitch)
			return false;
		if (homerun != other.homerun)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rbi != other.rbi)
			return false;
		if (run != other.run)
			return false;
		if (stolenBase != other.stolenBase)
			return false;
		if (strikeOut != other.strikeOut)
			return false;
		if (triple != other.triple)
			return false;
		return true;
	}

}
