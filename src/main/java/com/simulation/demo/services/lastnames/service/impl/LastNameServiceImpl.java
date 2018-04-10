package com.simulation.demo.services.lastnames.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.LastNamesRequest;
import com.simulation.demo.domain.LastNames;
import com.simulation.demo.services.lastnames.assembler.LastNamesAssembler;
import com.simulation.demo.services.lastnames.dto.LastNamesDto;
import com.simulation.demo.services.lastnames.repository.LastNamesRepository;
import com.simulation.demo.services.lastnames.service.LastNamesService;

@Service
public class LastNameServiceImpl implements LastNamesService {
	
	@Autowired
	private LastNamesRepository lastNameRepository;
	
	@Override
	public LastNamesDto addLastName(LastNamesRequest lastNames) {
		LastNames ln = new LastNames();
		ln.setLastName(lastNames.getLastName());
		lastNameRepository.save(ln);
		
		return LastNamesAssembler.fromLastNames(ln);
	}
	
	@Override
	public LastNamesDto findLastNameByID(Long id) {
		LastNames ln = new LastNames();
		ln = lastNameRepository.findById(id).get();
		return LastNamesAssembler.fromLastNames(ln);
	}

}
