package com.xworkz.app.repository;

public interface CountryRepository {
	int TOTAL_COUNTRIES = 4;

	void save(String countryName);

	default boolean isExist(String countryName) {
		return false;
	}

}
