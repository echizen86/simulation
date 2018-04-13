package com.simulation.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.controllers.request.UserRequest;
import com.simulation.demo.services.user.dto.UserDto;
import com.simulation.demo.services.user.service.UserService;

@RestController
public class UserController {
	
	UserService userService;
	
//	public UserDto addUser(UserRequest user) {
//		return userService.
//	}

}
