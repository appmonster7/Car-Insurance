package com.ibm.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Car;
import com.ibm.entity.Insurance;

import com.ibm.repo.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceRepository repo;
	
	@Autowired
	private CarService cservice;

	

	@Override
	public void save(Insurance i, int carId) {
		Car c = cservice.fetchById(carId);
		i.setCar(c);
		repo.save(i);
	}



	@Override
	public void deleteInsById(int id) {
		repo.deleteById(id);
		
	}



//	@Override
//	public Insurance fetchById(int insId) {
//
//		return repo.getById(insId);
//	}

	
}
