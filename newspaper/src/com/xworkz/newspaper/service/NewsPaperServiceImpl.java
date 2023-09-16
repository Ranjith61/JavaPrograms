package com.xworkz.newspaper.service;

import com.xworkz.newspaper.dto.NewsPaperDTO;
import com.xworkz.newspaper.repository.NewsPaperRepository;

public class NewsPaperServiceImpl implements NewsPaperService {
	private NewsPaperRepository newsPaperRepository;

	public NewsPaperServiceImpl(NewsPaperRepository newsPaperRepository) {
		this.newsPaperRepository = newsPaperRepository;

	}

	@Override
	public boolean validation(NewsPaperDTO dto) {
		System.out.println("Invoking validation in NewsPaperServiceImpl");
		if (dto != null) // name,cost,pages,author
		{
			String name = dto.getName();
			int cost = dto.getCost();
			int pages = dto.getPages();
			String author = dto.getAuthor();
			if (name != null && !name.isEmpty() && name.length() > 4 && name.length() < 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid....");
				return false;
			}
			if (cost != 0 && pages != 0) {
				System.out.println("it is valid.");
			} else {
				System.err.println("it is not valid..");
				return false;
			}

			if (author != null && !author.isEmpty() && author.length() > 6 && author.length() < 20) {
				System.out.println("It is valid..");
			} else {
				System.err.println("It is in valid..");
				return false;
			}
			boolean exist = this.newsPaperRepository.isExist(dto);

			System.out.println("dto is valid, then store data in " + this.getClass().getSimpleName());
			this.newsPaperRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}

}
