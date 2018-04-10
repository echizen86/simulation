package com.simulation.demo.services.names.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.demo.controllers.request.NamesRequest;
import com.simulation.demo.domain.Names;
import com.simulation.demo.services.names.assembler.NamesAssembler;
import com.simulation.demo.services.names.dto.NamesDto;
import com.simulation.demo.services.names.repository.NamesRepository;
import com.simulation.demo.services.names.service.NamesService;

@Service
public class NamesServiceImpl implements NamesService {
	
	@Autowired
	private NamesRepository namesRepository;
	
	@Override
	public NamesDto addName(NamesRequest name) {
		Names n = new Names();
		n.setName(name.getName());
		namesRepository.save(n);
		
		return NamesAssembler.fromNames(n);
	}
	
	@Override
	public NamesDto findNameByID(Long id) {
		Names n = new Names();
		n = namesRepository.findById(id).get();
		return NamesAssembler.fromNames(n);
	}

}
