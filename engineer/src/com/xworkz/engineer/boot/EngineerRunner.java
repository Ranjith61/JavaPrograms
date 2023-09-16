package com.xworkz.engineer.boot;

import com.xworkz.engineer.dto.EngineerDTO;
import com.xworkz.engineer.repository.EngineerRepository;
import com.xworkz.engineer.repository.EngineerRepositoryImpl;
import com.xworkz.engineer.service.EngineerService;
import com.xworkz.engineer.service.EngineerServiceImpl;

public class EngineerRunner {
	public static void main(String[] args) {
		EngineerRepository engineerRepository = new EngineerRepositoryImpl();
		EngineerService engineerService = new EngineerServiceImpl(engineerRepository);

		EngineerDTO dto = new EngineerDTO(2, "karan", "EWIT");
		engineerService.validation(dto);

		EngineerDTO dto1 = new EngineerDTO(1, "kumar", "RV");
		engineerService.validation(dto1);

		boolean persisted = engineerService.validation(dto);
		System.out.println("persisted:" + persisted);

		EngineerDTO dto3 = new EngineerDTO(3, "varan", "SJBIT");
		engineerService.validation(dto3);

		boolean dto4 = engineerService.toFindName("karan");
		System.out.println("Found " + dto4);

	}

}
