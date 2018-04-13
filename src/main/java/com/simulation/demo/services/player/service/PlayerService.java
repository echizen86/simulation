package com.simulation.demo.services.player.service;

import java.util.List;

import com.simulation.demo.controllers.request.PlayerRequest;
import com.simulation.demo.domain.Player;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.player.dto.PlayerDto;

public interface PlayerService {

	PlayerDto addPlayer(PlayerRequest player);

	List<Player> CreatePlayersNew(Team t, int division);

}
