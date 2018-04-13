package com.simulation.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.controllers.request.LeagueRequest;
import com.simulation.demo.publisher.league.LeagueServicesPublicher;
import com.simulation.demo.services.league.dto.LeagueDto;

@RestController
public class LeagueController {
	
	@Autowired
	LeagueServicesPublicher leagueServicePublisher;
	
	// CREATE
	@RequestMapping(path = "/priv/league/create", method = RequestMethod.POST)
	public @ResponseBody LeagueDto addLeague(@RequestBody LeagueRequest leagueRequest) {
		return leagueServicePublisher.addLeague(leagueRequest);
	}

}
