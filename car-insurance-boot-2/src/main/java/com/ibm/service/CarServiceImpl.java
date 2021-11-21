package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Car;
import com.ibm.entity.Customer;
import com.ibm.entity.Insurance;
import com.ibm.repo.CarRepository;


@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository repo;
	
	@Autowired
	private CustomerService cservice;
	
	@Override
	public int add(Car c, int customerId) {
		Customer c1 = cservice.fetchById(customerId);
		c.setCustomer(c1);
		repo.save(c);
		return c.getCarId();
	}

	@Override
	public Car fetchById(int carId) {
		return repo.findById(carId).get();
	}

	@Override
	public List<Car> fetchAll() {
		
		return repo.findAll();
	}

	@Override
	public double getQuotation(String regNo , String coverageType) {
	
		Car c = repo.findByRegNo(regNo);
		double price = c.getPrice();
		int currntYr = 2021;
		int tenure = currntYr-c.getManufctYear();		
		
		if(coverageType.equals("thirdparty")) {
				if(tenure <= 5) {
			price -= price*tenure*30/100;
			
				}
			else if(tenure > 5) {
				price -= price*tenure*60/100;	
			}
		}
		else {
			if(tenure <= 5) {
				price -= price*tenure*20/100;
					}
				else if(tenure > 5) {
			price -= price*tenure*50/100;
				}	
	}
		return price;
	}

	@Override
	public void deleteCarById(int id) {
		repo.deleteById(id);
	}

}
