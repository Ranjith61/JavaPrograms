package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_PATIENTS = 6;
	
	public void save(DoctorDTO dto);

}
