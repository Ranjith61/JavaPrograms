package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public interface NewsPaperRepository {
	int TOTAL_ITEMS=10;

	public void save(NewsPaperDTO dto);
	
	default boolean isExist(NewsPaperDTO dto) {
		return false;
	}
	

}
