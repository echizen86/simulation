package com.simulation.demo.services.stats.service;

import com.simulation.demo.controllers.request.StatsRequest;
import com.simulation.demo.services.stats.dto.StatsDto;

public interface StatsService {

	StatsDto addStats(StatsRequest stats);

}
