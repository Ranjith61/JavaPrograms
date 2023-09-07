package com.xworkz.app.runner;
import com.xworkz.app.repository.CountryRepository;
import com.xworkz.app.repository.CountryRepositoryImpl;
import com.xworkz.app.service.CountryService;
import com.xworkz.app.service.CountryServiceImpl;

public class CountryRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in CountryRunner");
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryService countryService = new CountryServiceImpl(countryRepository);
		countryService.validateAndSave("India");
		countryService.validateAndSave("India");
		
	
	}

}
