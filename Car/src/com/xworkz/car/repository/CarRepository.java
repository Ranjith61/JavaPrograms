package com.xworkz.car.repository;

import com.xworkz.car.dto.CarDTO;

public interface CarRepository {
	
	public interface CarRepositary {
		public void save(CarDTO dto);
		public boolean isExist(CarDTO dto);
		public CarDTO findByName(String name);
		

	}

}
