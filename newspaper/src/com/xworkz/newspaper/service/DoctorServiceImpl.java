package com.xworkz.newspaper.service;

import com.xworkz.newspaper.dto.DoctorDTO;
import com.xworkz.newspaper.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		if (dto != null) // name,phoneNo,charges,place
		{
			String name = dto.getName();
			int phoneNo = dto.getPhoneNo();
			int charges = dto.getCharges();
			String place = dto.getPlace();
			if (name != null && !name.isEmpty() && name.length() > 4 && name.length() > 20) {
				System.out.println("The name is valid");
			} else {
				System.err.println("the name is invalid");

			}

			if (phoneNo != 0 && charges != 0) {
				System.out.println("phoneNO and charges are valid");

			} else {
				System.err.println("phoneNO and charges are invalid");
				return false;
			}

			if (place != null && !place.isEmpty() && place.length() > 4 && place.length() < 20) {
				System.out.println("the place is valid..");
			} else {
				System.err.println("The place is invalid");
			}

			System.out.println("dto is valid , then store data in" + this.getClass().getSimpleName());
			this.doctorRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
			return false;
		}
	}

}
