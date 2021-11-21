package com.ibm.service;

import java.util.List;

import com.ibm.entity.Car;


public interface CarService {
	
		int add(Car c, int customerId);
		
		Car fetchById(int c);
	
		List<Car> fetchAll();
		
		double getQuotation(String regNo , String coverageType,int duration);
		
		void deleteCarById(int id);

}
