package com.xworkz.newspaper.service;

import com.xworkz.newspaper.dto.DoctorDTO;

public interface DoctorService {
	boolean validateAndSave(DoctorDTO dto);
}
