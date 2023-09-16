package com.xworkz.newspaper.service;

import com.xworkz.newspaper.dto.AadharDTO;
import com.xworkz.newspaper.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository = aadharRepository;
	}

	@Override

	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("Invoking validateAndSave in NewsPaperServiceImpl");
		if (dto != null) // name,number,cost,colour
		{
			String name = dto.getName();
			int number = dto.getNumber();
			int cost = dto.getCost();
			String colour = dto.getColour();
			if (name != null && !name.isEmpty() && name.length() > 4 && name.length() > 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid.");
			}

			if (number != 0 && cost != 0) {
				System.out.println("it is valid..");
			} else {
				System.err.println("it is not valid..");
				return false;
			}

			if (colour != null && !colour.isEmpty() && colour.length() > 5 && colour.length() > 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid");
			}

			System.out.println("dto is valid, then store data in " + this.getClass().getSimpleName());
			this.aadharRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}

}
