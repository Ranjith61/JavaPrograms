package com.xworkz.app.service;

import com.xworkz.app.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public boolean validateAndSave(String countryName) {
		System.out.println("Invoking validateAndSave in CountryRepositoryImpl");
		if (countryName != null && !countryName.isEmpty() && countryName.length() >= 5 && countryName.length() <= 10) {
			System.out.println("countryName is valid , then store countryName " + this.getClass().getSimpleName());
			if (!this.countryRepository.isExist(countryName)) {
				this.countryRepository.save("India");
				return true;
			} else
				System.err.println("Country name " + countryName + " already exist,please insert another");

		} else {
			System.err.println("Cannot store data, countryName is invalid");
		}
		return false;
	}

}
