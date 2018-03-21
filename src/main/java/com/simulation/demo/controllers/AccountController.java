package com.simulation.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping(value = "/public/{accountNumber}")
	public String getPublicAccount(@PathVariable final int accountNumber) {
		return "Public Account # " + accountNumber;
	}
	
	@RequestMapping(value = "/private/{accountNumber}")
	public String getPrivateAccount(@PathVariable final int accountNumber) {
		return "Private Account # " + accountNumber;
	}
	
	@RequestMapping(value = "/private/admin/{accountNumber}")
	public String getPrivateAccountAdmin(@PathVariable final int accountNumber) {
		return "Private Account Admin # " + accountNumber;
	}
}
