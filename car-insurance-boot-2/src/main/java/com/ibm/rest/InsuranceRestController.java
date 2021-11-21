package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Insurance;
import com.ibm.service.InsuranceService;

@CrossOrigin
@RestController
public class InsuranceRestController {
	
	@Autowired
	private InsuranceService service;
	
	@PostMapping(value = "/insurance/{carId}" , consumes = "application/json")
	public String addInsurance(@RequestBody Insurance insurance , @PathVariable int carId) {
		service.save(insurance,carId);
		return "Insurance added";
	}
	
//	@GetMapping(value = "/insurance/{id}" , produces = "application/json")
//	public Insurance getById(@PathVariable int id) {
//		Insurance i = service.fetchById(id);
//		return i;
//		
//	}
	
	@DeleteMapping(value = "/deleteins/{id}")
	public String delInsurance(@PathVariable int id) {
		service.deleteInsById(id);
		return "Insurance deleted";
	}
}
