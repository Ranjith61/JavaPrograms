package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public interface ApplicationRepository {
	int TOTAL_APPLICATIONS = 5;

	public void save(ApplicationDTO dto);

	default boolean isExist(ApplicationDTO dto) {
		return false;
	}

	public ApplicationDTO findByName(String name);
	
	public ApplicationDTO findByNameAndDevelopedBy(String name,String developedAt);

	
	

}
