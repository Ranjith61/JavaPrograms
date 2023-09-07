package com.xworkz.app.runner;

import com.xworkz.app.repository.LocationRepository;
import com.xworkz.app.repository.LocationRepositoryImpl;
import com.xworkz.app.service.*;

public class LocationRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in location Runner");
		LocationRepository locationRepository = new LocationRepositoryImpl();
		LocationService locationService = new LocationServiceImpl(locationRepository);
		
		locationService.validateAndSave("Banglore");
		locationService.validateAndSave("Banglore");
		
		
		
		
	}
	
	

}
