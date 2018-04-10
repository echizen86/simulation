package com.simulation.demo.services.lastnames.service;

import com.simulation.demo.controllers.request.LastNamesRequest;
import com.simulation.demo.services.lastnames.dto.LastNamesDto;

public interface LastNamesService {

	LastNamesDto findLastNameByID(Long id);

	LastNamesDto addLastName(LastNamesRequest lastNames);

}
