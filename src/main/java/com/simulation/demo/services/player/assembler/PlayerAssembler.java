package com.simulation.demo.services.player.assembler;

import com.simulation.demo.domain.Player;
import com.simulation.demo.services.player.dto.PlayerDto;

public class PlayerAssembler {
	
	public static PlayerDto fromPlayer(Player player) {
		PlayerDto playerDto = new PlayerDto();
		playerDto.setId(player.getId());
		playerDto.setFirstName(player.getFirstName());
		playerDto.setLastName(player.getLastName());
		playerDto.setNationality(player.getNationality());
		playerDto.setStats(player.getStats());
		playerDto.setTeam(player.getTeam());
		
		return playerDto;
	}

}
