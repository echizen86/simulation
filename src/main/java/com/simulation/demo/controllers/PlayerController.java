package com.simulation.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.services.player.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

}
