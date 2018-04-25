package com.simulation.demo.services.game.dto;

import java.util.Date;
import java.util.List;

import com.simulation.demo.domain.Inning;
import com.simulation.demo.domain.Player;
import com.simulation.demo.domain.Team;

public class GameDto {

private Long id;
	
	private Team visitor;
	
	private Team home;
	
	private Date date;
	
	private List<Inning> innings;
	
	private Player pitcherWinner;
	
	private Player pitcherLoser;
	
	private Player pitcherSaver;
	
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

	public void setDate(Date date2) {
		this.date = date2;
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
	
	
}
