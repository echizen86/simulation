package com.simulation.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats_pitching")
public class StatsGamesPitching {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "game_win")
	private int gameWin;

	@Column(name = "game_lose")
	private int gameLose;

	@Column(name = "game_save")
	private int gameSave;

	@Column(name = "game_started")
	private int gameStarted;

	@Column(name = "inning_pitch")
	private float inningPitch;

	@Column(name = "hit")
	private int hit;

	@Column(name = "run")
	private int run;

	@Column(name = "erased_run")
	private int erasedRun;

	@Column(name = "homerun")
	private int homerun;

	@Column(name = "bb")
	private int bb;

	@Column(name = "strike_out")
	private int strikeOut;

	@Column(name = "at_bat")
	private int atBat;

	@Column(name = "hit_by_pitcher")
	public int hitByPitch;

	public int getAVE() {
		return (int) this.getHit() / this.getAtBat();
	}

	public float getERA() {
		return (float) ((this.getErasedRun() * 9) / this.getInningPitch());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getErasedRun() {
		return erasedRun;
	}

	public void setErasedRun(int erasedRun) {
		this.erasedRun = erasedRun;
	}

	public int getHitByPitch() {
		return hitByPitch;
	}

	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}

	public int getGameWin() {
		return gameWin;
	}

	public void setGameWin(int gameWin) {
		this.gameWin = gameWin;
	}

	public int getGameLose() {
		return gameLose;
	}

	public void setGameLose(int gameLose) {
		this.gameLose = gameLose;
	}

	public int getGameSave() {
		return gameSave;
	}

	public void setGameSave(int gameSave) {
		this.gameSave = gameSave;
	}

	public int getGameStarted() {
		return gameStarted;
	}

	public void setGameStarted(int gameStarted) {
		this.gameStarted = gameStarted;
	}

	public float getInningPitch() {
		return inningPitch;
	}

	public void setInningPitch(int inningPitch) {
		this.inningPitch = inningPitch;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getHomerun() {
		return homerun;
	}

	public void setHomerun(int homerun) {
		this.homerun = homerun;
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

	public int getAtBat() {
		return atBat;
	}

	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}

	@Override
	public String toString() {
		return "StatsGamesPitching [id=" + id + ", gameWin=" + gameWin + ", gameLose=" + gameLose + ", gameSave="
				+ gameSave + ", gameStarted=" + gameStarted + ", inningPitch=" + inningPitch + ", hit=" + hit + ", run="
				+ run + ", erasedRun=" + erasedRun + ", homerun=" + homerun + ", bb=" + bb + ", strikeOut=" + strikeOut
				+ ", atBat=" + atBat + ", hitByPitch=" + hitByPitch + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atBat;
		result = prime * result + bb;
		result = prime * result + erasedRun;
		result = prime * result + gameLose;
		result = prime * result + gameSave;
		result = prime * result + gameStarted;
		result = prime * result + gameWin;
		result = prime * result + hit;
		result = prime * result + hitByPitch;
		result = prime * result + homerun;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Float.floatToIntBits(inningPitch);
		result = prime * result + run;
		result = prime * result + strikeOut;
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
		StatsGamesPitching other = (StatsGamesPitching) obj;
		if (atBat != other.atBat)
			return false;
		if (bb != other.bb)
			return false;
		if (erasedRun != other.erasedRun)
			return false;
		if (gameLose != other.gameLose)
			return false;
		if (gameSave != other.gameSave)
			return false;
		if (gameStarted != other.gameStarted)
			return false;
		if (gameWin != other.gameWin)
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
		if (Float.floatToIntBits(inningPitch) != Float.floatToIntBits(other.inningPitch))
			return false;
		if (run != other.run)
			return false;
		if (strikeOut != other.strikeOut)
			return false;
		return true;
	}

}
