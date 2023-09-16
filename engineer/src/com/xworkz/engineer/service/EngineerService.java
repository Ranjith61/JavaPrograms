package com.xworkz.engineer.service;

import com.xworkz.engineer.dto.EngineerDTO;

public interface EngineerService {
	boolean validation(EngineerDTO dto);
	public boolean toFindName(String name);

}
