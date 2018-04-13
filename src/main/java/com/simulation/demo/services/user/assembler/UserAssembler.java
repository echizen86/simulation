package com.simulation.demo.services.user.assembler;

import com.simulation.demo.domain.User;
import com.simulation.demo.services.user.dto.UserDto;

public class UserAssembler {
	
	public static UserDto fromUser(User user) {
		UserDto u = new UserDto();
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setRole(user.getRole());
		u.setTeam(user.getTeam());
		
		return u;
	}

}
