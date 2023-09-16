package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL_CARDS = 5;

	public void save(AadharDTO dto);

}
