package com.simulation.demo.services.names.assembler;

import com.simulation.demo.domain.Names;
import com.simulation.demo.services.names.dto.NamesDto;

public class NamesAssembler {
	
	public static NamesDto fromNames(Names names) {
		NamesDto nameDto = new NamesDto();
		nameDto.setId(names.getId());
		nameDto.setName(names.getName());

		return nameDto;
	}

}
