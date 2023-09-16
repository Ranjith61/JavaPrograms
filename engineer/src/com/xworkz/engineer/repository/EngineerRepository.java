package com.xworkz.engineer.repository;

import com.xworkz.engineer.dto.EngineerDTO;

public interface EngineerRepository {
	int TOTAL_ENGINEERS = 5;

	public void save(EngineerDTO dto);

	default boolean isExist(EngineerDTO dto) {
		return false;
	}
	public EngineerDTO findName(String name);
}
