package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDTO;

public interface ApplicationService {
	boolean validation(ApplicationDTO dto);

	public ApplicationDTO toFindName(String name);

	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedAt);

}
