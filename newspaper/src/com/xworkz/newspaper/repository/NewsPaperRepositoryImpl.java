package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public class NewsPaperRepositoryImpl implements NewsPaperRepository {
	NewsPaperDTO[] dto = new NewsPaperDTO[TOTAL_ITEMS];
	int position;

	@Override
	public void save(NewsPaperDTO dto) {
		System.out.println("running save in " + this.getClass().getSimpleName());
		if (this.position < TOTAL_ITEMS) {
			this.dto[position] = dto;
			System.out.println(dto + "is saved at position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full cannot store the data" + dto);
		}

	}

	@Override
	public boolean isExist(NewsPaperDTO dto) {
		System.out.println("running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index <= this.position; index++) {
			NewsPaperDTO ref = this.dto[index];
			if(ref!=null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}
		return NewsPaperRepository.super.isExist(dto);
	}

}
