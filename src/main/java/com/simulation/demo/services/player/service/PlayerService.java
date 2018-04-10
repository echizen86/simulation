package com.simulation.demo.services.player.service;

import com.simulation.demo.controllers.request.PlayerRequest;
import com.simulation.demo.services.player.dto.PlayerDto;

public interface PlayerService {

	PlayerDto addPlayer(PlayerRequest player);

}
