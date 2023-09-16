package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	AadharDTO[] dto = new AadharDTO[TOTAL_CARDS];
	int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("Running save in " + this.getClass().getSimpleName());
		if (this.position < TOTAL_CARDS) {
			this.dto[position] = dto;
			System.out.println(dto + "is saved at position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full cannot store the data" + dto);
		}

	}

}
