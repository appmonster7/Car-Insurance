package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Car;
import com.ibm.service.CarService;

@CrossOrigin
@RestController
public class CarRestController {
	
	@Autowired
	private CarService service;
	
	@PostMapping(value="/car/{userId}" , consumes = "application/json")
	public String addCar(@RequestBody Car car, @PathVariable int userId) {
		service.add(car, userId);
		return "car added";
	}
	
	@GetMapping(value="/car/{userid}" , produces = "application/json")
	public Car getCar(@PathVariable int id) {
		Car c = service.fetchById(id);
		return c;
	}
	
	@GetMapping(value="/cars" , produces = "application/json")
	public List<Car> getAllCar(){
		List<Car> car = service.fetchAll();
		return car;
		
	}
	
	@DeleteMapping(value = "/deletecar/{id}" )
	public String delCar(@PathVariable int id) {
		service.deleteCarById(id);
		return "Car deleted";
	}
	
	@GetMapping(value = "/car/quote")
	public double getQuotation(@RequestParam String regNo , @RequestParam String coverageType) {
		return service.getQuotation(regNo,coverageType);
	}


}
