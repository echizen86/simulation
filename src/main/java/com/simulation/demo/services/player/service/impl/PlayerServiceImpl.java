package com.simulation.demo.services.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.PlayerRequest;
import com.simulation.demo.domain.Player;
import com.simulation.demo.services.player.assembler.PlayerAssembler;
import com.simulation.demo.services.player.dto.PlayerDto;
import com.simulation.demo.services.player.repository.PlayerRepository;
import com.simulation.demo.services.player.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public PlayerDto addPlayer(PlayerRequest player) {
		Player p = new Player();
		p.setFirstName(player.getFirstName());
		p.setLastName(player.getLastName());
		p.setNationality(player.getNationality());
		p.setTeam(player.getTeam());
		p.setStats(player.getStats());
		
		playerRepository.save(p);
		
		return PlayerAssembler.fromPlayer(p);
	}
}
