package com.xworkz.app.repository;

public interface Juice {
	int TOTAL_VALUE = 5;

	void store(String name);

	default boolean isExist(String name) {
		return false;
	}

}
