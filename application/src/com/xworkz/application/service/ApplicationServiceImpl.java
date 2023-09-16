package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validation(ApplicationDTO dto) {
		System.out.println("Invoking validation in ApplicationServiceImpl");
		if (dto != null)// id,name,developedAt,version
		{
			int id = dto.getId();
			String name = dto.getName();
			String developedAt = dto.getDevelopedAt();
			String version = dto.getVersion();
			if (id != 0) {
				System.out.println("it is valid");
			} else {
				System.err.println("it is not valid");
			}
			if (name != null && !name.isEmpty() && name.length() > 5 && name.length() < 20) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is not valid...");
			}
			if (name != null && !name.isEmpty() && name.length() > 4 && name.length() < 21) {
				System.out.println("it is valid");
			} else {
				System.err.println("it is not valid");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 22) {
				System.out.println("It is valid");
			} else {
				System.err.println("It is in invalid");
			}
			if (developedAt != null && !developedAt.isEmpty() && developedAt.length() > 4
					&& developedAt.length() < 21) {
				System.out.println("It is valid");
			} else {
				System.err.println("It is invalid");
			}
			if (version != null && !version.isEmpty() && version.length() > 2 && version.length() < 19) {
				System.out.println("It is valid");
			} else {
				System.err.println("it is invalid");
			}
		}

		return false;
	}

	@Override
	public ApplicationDTO toFindName(String name) {
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() < 20) {
			System.out.println("name is valids, will find");
			ApplicationDTO dto = this.applicationRepository.findByName(name);
			return dto;
		} else {
			System.err.println("name is invalid");
		}
		return null;
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedAt) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20 && developedAt != null
				&& !developedAt.isEmpty() && developedAt.length() > 3 && developedAt.length() < 20) {
			System.out.println("name and developedAt  is valid, will find");
			ApplicationDTO dto = this.applicationRepository.findByNameAndDevelopedBy(name, developedAt);
			return dto;
		} else {
			System.err.println("name and developedAt is invalid");
		}

		return null;
	}

}
