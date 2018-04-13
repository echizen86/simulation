package com.simulation.demo.services.user.service.impl;

import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.UserRequest;
import com.simulation.demo.domain.Role;
import com.simulation.demo.domain.User;
import com.simulation.demo.services.user.dto.UserDto;
import com.simulation.demo.services.user.repository.UserRepository;
import com.simulation.demo.services.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	UserRepository userRepository;

//	@Override
//	public UserDto addUser(UserRequest user) {
//		User u = new User();
//		u.setUsername(user.getUsername());
//		u.setPassword(user.getPassword());
//		
//	}
}
