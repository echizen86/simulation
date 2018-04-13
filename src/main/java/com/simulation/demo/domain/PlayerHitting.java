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
@Table(name = "player_hitting")
public class PlayerHitting extends Player{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@OneToOne()
	@JoinColumn(name = "statsGamesHitting_id")
	private StatsGamesHitting statsGamesHitting;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatsGamesHitting getStatsGamesHitting() {
		return statsGamesHitting;
	}

	public void setStatsGamesHitting(StatsGamesHitting statsGamesHitting) {
		this.statsGamesHitting = statsGamesHitting;
	}

}
