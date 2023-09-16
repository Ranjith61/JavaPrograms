package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {
	DoctorDTO[] dto = new DoctorDTO[TOTAL_PATIENTS];
	int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("Running save in" + this.getClass().getSimpleName());
		if (this.position < TOTAL_PATIENTS) {
			this.dto[position] = dto;
			System.out.println(dto + "is saved at position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full cannot store the data" + dto);
		}

	}

}
