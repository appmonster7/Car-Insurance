package com.ibm.service;


import com.ibm.entity.Insurance;


public interface InsuranceService {
	void save(Insurance i, int carId);
	
	
	void deleteInsById(int id);
	
//	Insurance fetchById(int insId);
}
