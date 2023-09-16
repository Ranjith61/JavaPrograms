package com.xworkz.engineer.service;

import com.xworkz.engineer.dto.EngineerDTO;
import com.xworkz.engineer.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {
	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validation(EngineerDTO dto) {
		System.out.println("Invoking validation in EngineerRepositoryImpl");
		if (dto != null) // id,name,college name
		{
			int id = dto.getId();
			String name = dto.getName();
			String collegeName = dto.getCollegeName();
			if (id != 0) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is invalid");
			}
			if (name != null && !name.isEmpty() && name.length() > 5 && name.length() < 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid...");
			}
			if (collegeName != null && !collegeName.isEmpty() && collegeName.length() > 6
					&& collegeName.length() < 21) {
				System.out.println("It is valid..");
			} else {
				System.err.println("it is invalid");
			}

		}

		return false;
	}

	@Override
	public boolean toFindName(String name) {
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() < 20) {
			System.out.println("name is valids, will find");
			EngineerDTO dto = this.engineerRepository.findName(name);
			engineerRepository.findName(name);
			return true;
		} else {
			System.err.println("Publisher is invalid");
		}
		return false;
	}

}
