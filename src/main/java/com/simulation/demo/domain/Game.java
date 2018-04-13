package com.simulation.demo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	private Team visitor;
	
	private Team home;
	
	private Date date;
	
	private List<Inning> innings;
	
	private Player pitcherWinner;
	
	private Player pitcherLoser;
	
	private Player pitcherSaver;
	
	private List<Player> homeruns;

}
