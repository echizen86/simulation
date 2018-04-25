package com.simulation.demo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@OneToOne()
	@JoinColumn(name = "team_visitor_id")
	private Team visitor;
	
	@OneToOne()
	@JoinColumn(name = "team_home_id")
	private Team home;
	
	private Date date;
	
	@ManyToOne(targetEntity=Inning.class)
	@JoinColumn(name = "inning_id")
	private List<Inning> innings;
	
	@OneToOne(targetEntity=Player.class)
	@JoinColumn(name = "pitcher_winner_id")
	private Player pitcherWinner;
	
	@OneToOne(targetEntity=Player.class)
	@JoinColumn(name = "pitcher_loser_id")
	private Player pitcherLoser;
	
	@OneToOne(targetEntity=Player.class)
	@JoinColumn(name = "pitcher_saver_id")
	private Player pitcherSaver;
	
	@ManyToOne(targetEntity=Player.class)
	@JoinColumn(name = "player_id")
	private List<Player> homeruns;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Team getVisitor() {
		return visitor;
	}

	public void setVisitor(Team visitor) {
		this.visitor = visitor;
	}

	public Team getHome() {
		return home;
	}

	public void setHome(Team home) {
		this.home = home;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Inning> getInnings() {
		return innings;
	}

	public void setInnings(List<Inning> innings) {
		this.innings = innings;
	}

	public Player getPitcherWinner() {
		return pitcherWinner;
	}

	public void setPitcherWinner(Player pitcherWinner) {
		this.pitcherWinner = pitcherWinner;
	}

	public Player getPitcherLoser() {
		return pitcherLoser;
	}

	public void setPitcherLoser(Player pitcherLoser) {
		this.pitcherLoser = pitcherLoser;
	}

	public Player getPitcherSaver() {
		return pitcherSaver;
	}

	public void setPitcherSaver(Player pitcherSaver) {
		this.pitcherSaver = pitcherSaver;
	}

	public List<Player> getHomeruns() {
		return homeruns;
	}

	public void setHomeruns(List<Player> homeruns) {
		this.homeruns = homeruns;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", visitor=" + visitor + ", home=" + home + ", date=" + date + ", innings=" + innings
				+ ", pitcherWinner=" + pitcherWinner + ", pitcherLoser=" + pitcherLoser + ", pitcherSaver="
				+ pitcherSaver + ", homeruns=" + homeruns + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + ((homeruns == null) ? 0 : homeruns.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((innings == null) ? 0 : innings.hashCode());
		result = prime * result + ((pitcherLoser == null) ? 0 : pitcherLoser.hashCode());
		result = prime * result + ((pitcherSaver == null) ? 0 : pitcherSaver.hashCode());
		result = prime * result + ((pitcherWinner == null) ? 0 : pitcherWinner.hashCode());
		result = prime * result + ((visitor == null) ? 0 : visitor.hashCode());
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
		Game other = (Game) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		if (homeruns == null) {
			if (other.homeruns != null)
				return false;
		} else if (!homeruns.equals(other.homeruns))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (innings == null) {
			if (other.innings != null)
				return false;
		} else if (!innings.equals(other.innings))
			return false;
		if (pitcherLoser == null) {
			if (other.pitcherLoser != null)
				return false;
		} else if (!pitcherLoser.equals(other.pitcherLoser))
			return false;
		if (pitcherSaver == null) {
			if (other.pitcherSaver != null)
				return false;
		} else if (!pitcherSaver.equals(other.pitcherSaver))
			return false;
		if (pitcherWinner == null) {
			if (other.pitcherWinner != null)
				return false;
		} else if (!pitcherWinner.equals(other.pitcherWinner))
			return false;
		if (visitor == null) {
			if (other.visitor != null)
				return false;
		} else if (!visitor.equals(other.visitor))
			return false;
		return true;
	}
	
	

}
