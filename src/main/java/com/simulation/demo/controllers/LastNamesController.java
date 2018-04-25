package com.simulation.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.controllers.request.LastNamesRequest;
import com.simulation.demo.services.lastnames.dto.LastNamesDto;
import com.simulation.demo.services.lastnames.service.LastNamesService;

@RestController
public class LastNamesController {

	@Autowired
	private LastNamesService lastNameService;

	// CREATE
	@RequestMapping(path = "/priv/lastnames", method = RequestMethod.POST)
	public @ResponseBody LastNamesDto addLastName(@RequestBody LastNamesRequest lastName) {
		return lastNameService.addLastName(lastName);
	}

	// FINDbyID
	@RequestMapping(path = "/priv/lastnames/{id}", method = RequestMethod.GET)
	public @ResponseBody LastNamesDto findLastName(@PathVariable Long id) {
		return lastNameService.findLastNameByID(id);
	}

}
