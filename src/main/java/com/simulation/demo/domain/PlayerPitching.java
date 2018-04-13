package com.simulation.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player_pitching")
public class PlayerPitching extends Player{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@OneToOne()
	@JoinColumn(name = "statsGamesPitching_id")
	private StatsGamesPitching statsGamesPitching;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatsGamesPitching getStatsGamesPitching() {
		return statsGamesPitching;
	}

	public void setStatsGamesPitching(StatsGamesPitching statsGamesPitching) {
		this.statsGamesPitching = statsGamesPitching;
	}
	
	

}
