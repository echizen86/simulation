package com.simulation.demo.services.season.service;

import java.util.Date;

import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Season;
import com.simulation.demo.services.season.dto.SeasonDto;

public interface SeasonService {

	SeasonDto createSeason(Season season, Date startDate, League league);

	Season findByNumber(int number);

}
