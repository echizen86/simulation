package com.simulation.demo.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.controllers.request.SeasonRequest;
import com.simulation.demo.publisher.league.LeagueServicesPublicher;
import com.simulation.demo.services.season.dto.SeasonDto;

@RestController
public class SeasonController {

	@Autowired
	private LeagueServicesPublicher leagueServicePublisher;

	// CREATE
	@RequestMapping(path = "/priv/season/create", method = RequestMethod.POST)
	public @ResponseBody SeasonDto addSeason(@RequestParam int season,
			@RequestParam String startDate,
			@RequestParam Long league) {
		return leagueServicePublisher.addSeason(season, startDate, league);
	}
}
