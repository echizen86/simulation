package com.simulation.demo.services.names.service;

import com.simulation.demo.controllers.request.NamesRequest;
import com.simulation.demo.services.names.dto.NamesDto;

public interface NamesService {

	NamesDto addName(NamesRequest name);

	NamesDto findNameByID(Long id);

}
