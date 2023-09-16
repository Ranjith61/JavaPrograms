package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.dto.DoctorDTO;
import com.xworkz.newspaper.repository.DoctorRepository;
import com.xworkz.newspaper.repository.DoctorRepositoryImpl;
import com.xworkz.newspaper.service.DoctorService;
import com.xworkz.newspaper.service.DoctorServiceImpl;

public class DoctorRunner {
	public static void main(String[] args) {
		DoctorRepository doctorRepository = new DoctorRepositoryImpl();
		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
		DoctorDTO dto = new DoctorDTO("venkatachala", 12, 10, "Banglore");
		doctorService.validateAndSave(dto);
		boolean persisted = doctorService.validateAndSave(dto);
		System.out.println("persisted:" + persisted);

	}

}
