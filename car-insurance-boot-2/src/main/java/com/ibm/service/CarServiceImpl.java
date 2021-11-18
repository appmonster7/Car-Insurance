package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.entity.Car;
import com.ibm.repo.CarRepository;

public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository repo;
	
	@Override
	public void save(Car c) {
		repo.save(c);
	}

	@Override
	public Car fetchById(int car_id) {
		return repo.findById(car_id).get();
	}

	@Override
	public Car fetchByRegNo(int regNo) {
		return repo.findByRegNo(regNo);
	}

	@Override
	public List<Car> fetchAll() {
		
		return repo.findAll();
	}

	@Override
	public List<Car> getByCustId(int c) {
		
		return repo.findAllByCustomer(c);
	}

}
