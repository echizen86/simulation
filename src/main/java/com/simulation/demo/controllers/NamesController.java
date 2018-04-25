package com.simulation.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.demo.controllers.request.NamesRequest;
import com.simulation.demo.services.names.dto.NamesDto;
import com.simulation.demo.services.names.service.NamesService;

@RestController
public class NamesController {
	
	@Autowired
	private NamesService nameService;

	// CREATE
	@RequestMapping(path = "/priv/names", method = RequestMethod.POST)
	public @ResponseBody NamesDto addName(@RequestBody NamesRequest name) {
		return nameService.addName(name);
	}

	// FINDbyID
	@RequestMapping(path = "/priv/names/{id}", method = RequestMethod.GET)
	public @ResponseBody NamesDto findLastName(@PathVariable Long id) {
		return nameService.findNameByID(id);
	}

}
