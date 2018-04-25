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
@Table(name = "inning")
public class Inning {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@OneToOne()
	@JoinColumn(name = "statsGamesHitting_id")
	private StatsGamesHitting statsGamesHitting;
	
	@OneToOne()
	@JoinColumn(name = "statsGamePitching_id")
	private StatsGamesPitching statsGamePitching;
	
	@OneToOne()
	@JoinColumn(name = "statsGameFielding_id")
	private StatsGamesFielding statsGameFielding;

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

	public StatsGamesPitching getStatsGamePitching() {
		return statsGamePitching;
	}

	public void setStatsGamePitching(StatsGamesPitching statsGamePitching) {
		this.statsGamePitching = statsGamePitching;
	}

	public StatsGamesFielding getStatsGameFielding() {
		return statsGameFielding;
	}

	public void setStatsGameFielding(StatsGamesFielding statsGameFielding) {
		this.statsGameFielding = statsGameFielding;
	}

	@Override
	public String toString() {
		return "Inning [id=" + id + ", statsGamesHitting=" + statsGamesHitting + ", statsGamePitching="
				+ statsGamePitching + ", statsGameFielding=" + statsGameFielding + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((statsGameFielding == null) ? 0 : statsGameFielding.hashCode());
		result = prime * result + ((statsGamePitching == null) ? 0 : statsGamePitching.hashCode());
		result = prime * result + ((statsGamesHitting == null) ? 0 : statsGamesHitting.hashCode());
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
		Inning other = (Inning) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (statsGameFielding == null) {
			if (other.statsGameFielding != null)
				return false;
		} else if (!statsGameFielding.equals(other.statsGameFielding))
			return false;
		if (statsGamePitching == null) {
			if (other.statsGamePitching != null)
				return false;
		} else if (!statsGamePitching.equals(other.statsGamePitching))
			return false;
		if (statsGamesHitting == null) {
			if (other.statsGamesHitting != null)
				return false;
		} else if (!statsGamesHitting.equals(other.statsGamesHitting))
			return false;
		return true;
	}
	
	

}
