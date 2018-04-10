package com.simulation.demo.services.lastnames.assembler;

import com.simulation.demo.domain.LastNames;
import com.simulation.demo.services.lastnames.dto.LastNamesDto;

public class LastNamesAssembler {

	public static LastNamesDto fromLastNames(LastNames lastNames) {
		LastNamesDto lastNamesDto = new LastNamesDto();
		lastNamesDto.setId(lastNames.getId());
		lastNamesDto.setLastName(lastNames.getLastName());

		return lastNamesDto;
	}
}
