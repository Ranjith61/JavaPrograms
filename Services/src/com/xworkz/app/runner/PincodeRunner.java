package com.xworkz.app.runner;

import com.xworkz.app.repository.PincodeRepository;
import com.xworkz.app.repository.PincodeRepositoryImpl;
import com.xworkz.app.service.PincodeServiceImpl;
import com.xworkz.app.service.PincodeService;

public class PincodeRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PincodeRunner");
		PincodeRepository pincodeRepository = new PincodeRepositoryImpl();

		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);
		boolean ref = pincodeService.validateAndSave(560001);
		System.out.println(ref);

		boolean ref1 = pincodeService.validateAndSave(560001);
		System.out.println(ref1);
	}
}
