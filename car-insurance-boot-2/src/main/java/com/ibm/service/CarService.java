package com.ibm.service;

import java.util.List;

import com.ibm.entity.Car;

public interface CarService {
	
		void save(Car c);
		
		Car fetchById(int c);
		
		Car fetchByRegNo(int c);
		
		List<Car> fetchAll();
		
		List<Car> getByCustId(int c);

}
