package com.xworkz.application.boot;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImpl;
import com.xworkz.application.service.*;

public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);
		
		ApplicationDTO dto = new ApplicationDTO(2, "Ranjith", "pune", "version 1.8");
		applicationService.validation(dto);
		
		ApplicationDTO dto1 = new ApplicationDTO(1, "kumar", "Banglore", "version 3.2");
		applicationService.validation(dto1);
		
		boolean persisted = applicationService.validation(dto);
		System.out.println("persisted:" + persisted);
		
		ApplicationDTO dto2 = new ApplicationDTO(3, "sundar pichai", "mumbai", "version33.2");
		applicationService.validation(dto2);
		
		ApplicationDTO dto3 = applicationService.toFindName("sundar pichai");
		System.out.println("Found " + dto3);
		
		ApplicationDTO dto4 = applicationService.findByNameAndDevelopedBy("Ranjith", "pune");
		System.out.println("findByNameAndDevelopedBy Found : " + dto4);
	}

}
