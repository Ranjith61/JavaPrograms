package com.xworkz.app.repository;

public class CountryRepositoryImpl implements CountryRepository {
	private String[] countries = new String[TOTAL_COUNTRIES];
	private int position;

	@Override
	public void save(String countryName) {
		System.out.println("Invoking save in CountryRepositoryImpl");

		if (this.position < TOTAL_COUNTRIES) {
			this.countries[position] = countryName;
			System.out.println("stored " + countryName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full, cannot store countries...");

		}
	}

	@Override
	public boolean isExist(String countryName) {
		for (int start = 0; start <= this.position; start++) {
			String temp = this.countries[start];
			if (temp != null && temp.equals(countryName)) {
				System.err.println("ContryName is already exist");
				return true;
			}
		}
		return false;
	}
}
