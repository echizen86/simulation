package com.simulation.demo.services.player.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.PlayerRequest;
import com.simulation.demo.domain.Player;
import com.simulation.demo.domain.PlayerHitting;
import com.simulation.demo.domain.PlayerPitching;
import com.simulation.demo.domain.Team;
import com.simulation.demo.services.lastnames.repository.LastNamesRepository;
import com.simulation.demo.services.names.repository.NamesRepository;
import com.simulation.demo.services.player.assembler.PlayerAssembler;
import com.simulation.demo.services.player.dto.PlayerDto;
import com.simulation.demo.services.player.repository.PlayerRepository;
import com.simulation.demo.services.player.service.PlayerService;
import com.simulation.demo.services.stats.service.StatsService;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private StatsService statsService;

	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private NamesRepository namesRepository;
	
	@Autowired
	private LastNamesRepository lastNamesRepository;
	
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
	
	private List<String> getPositionOFF(){
		List<String > positionOFF = new ArrayList<String>();
		positionOFF.add("C");
		positionOFF.add("C");
		positionOFF.add("1B");
		positionOFF.add("2B");
		positionOFF.add("3B");
		positionOFF.add("SS");
		positionOFF.add("RF");
		positionOFF.add("LF");
		positionOFF.add("CF");
		positionOFF.add("1B");
		positionOFF.add("SS");
		positionOFF.add("RF");
		positionOFF.add("CF");
		
		return positionOFF;
	}
	
	private List<String> getPositionPitch(){
		List<String > positionPitch = new ArrayList<String>();
		positionPitch.add("SP");
		positionPitch.add("SP");
		positionPitch.add("SP");
		positionPitch.add("SP");
		positionPitch.add("SP");
		positionPitch.add("RP");
		positionPitch.add("RP");
		positionPitch.add("RP");
		positionPitch.add("RP");
		positionPitch.add("RP");
		positionPitch.add("CP");
		positionPitch.add("CP");
		
		return positionPitch;
	}
	
	@Override
	public List<Player> CreatePlayersNew(Team t, int division){
		List<Player> players = new ArrayList<>();
		
		// PLAYERS OFF
		for(int i = 0; i < 13; i++) {
			Integer idName = (int) (Math.random() * 10) + 1;
			Integer idLastName = (int) (Math.random() * 10) + 1;
			Player p = new PlayerHitting();
			p.setFirstName(namesRepository.findById(idName.longValue()).get().getName());
			p.setLastName(lastNamesRepository.findById(idLastName.longValue()).get().getLastName());
			p.setPosition(this.getPositionOFF().get(i));
			p.setNationality("EEUU");
			p.setTeam(t);
			
			// STATS OFF
			p.setStats(statsService.CreateStatsOFF(division));
			
			playerRepository.save(p);
			
			players.add(p);
		}
		
		// PITCHERS
		for(int i = 0; i < 12; i++) {
			Integer idName = (int) (Math.random() * 10) + 1;
			Integer idLastName = (int) (Math.random() * 10) + 1;
			Player p = new PlayerPitching();
			p.setFirstName(namesRepository.findById(idName.longValue()).get().getName());
			p.setLastName(lastNamesRepository.findById(idLastName.longValue()).get().getLastName());
			p.setPosition(this.getPositionPitch().get(i));
			p.setNationality("EEUU");
			p.setTeam(t);
			
			// STATS PITCHER
			p.setStats(statsService.CreateStatsPitcher(division));
			
			playerRepository.save(p);
						
			players.add(p);
		}
		return players;		
	}
}
