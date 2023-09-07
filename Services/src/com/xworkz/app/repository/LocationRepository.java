package com.xworkz.app.repository;

public interface LocationRepository {
	int TOTAL_LOCATIONS = 5;

	void save(String locationName);

	default boolean isExist(String locationName) {
		return false;
	}

}
