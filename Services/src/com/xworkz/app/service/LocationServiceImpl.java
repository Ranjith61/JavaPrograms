package com.xworkz.app.service;

import com.xworkz.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
			this.locationRepository = locationRepository;
		}

	@Override
	public boolean validateAndSave(String locationName) {
		System.out.println("Invoking validateAndSave in LocationRepositoryImpl");
		if (locationName != null && !locationName.isEmpty() && locationName.length() >= 8 && locationName.length() <= 10) {
			System.out.println("countryName is valid , then store countryName " + this.getClass().getSimpleName());
			if (!this.locationRepository.isExist(locationName)) {
				this.locationRepository.save("Banglore");
				return true;
			} else
				System.err.println("locationName " + locationName + " already exist,please insert another");

		} else {
			System.err.println("Cannot store data, countryName is invalid");
		}
		return false;
	}

}
