package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {
	ApplicationDTO[] dto = new ApplicationDTO[TOTAL_APPLICATIONS];
	int position;

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("Running save in " + this.getClass().getSimpleName());
		if (this.position < TOTAL_APPLICATIONS) {
			this.dto[position] = dto;
			System.out.println(dto + "is saved at position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full cannot store the data" + dto);
		}
	}

	@Override
	public boolean isExist(ApplicationDTO dto) {
		System.out.println("running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index <= this.position; index++) {
			ApplicationDTO ref = this.dto[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}
		return ApplicationRepository.super.isExist(dto);
	}

	@Override
	public ApplicationDTO findByName(String name) {
		System.out.println("Finding the String name");
		for (int index = 0; index < position; index++) {
			ApplicationDTO ref = dto[index];
			if (ref.getName().equals(name)) {
				return ref;
			} else {
				System.err.println("it is not found");
			}

		}
		return null;
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name,String developedAt) {
		for (int index = 0; index < position; index++) {
			ApplicationDTO ref = dto[index];
			if(ref.getName().equals(name)&&ref.getDevelopedAt().equals(developedAt)) {
				System.out.println("name and developedAt is found");
				return ref;
			}else {
				System.err.println("name and developedAt is not found");
				
			}

		}
		return null;
	}

}
