package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.entity.Insurance;
import com.ibm.repo.InsuranceRepository;

public class InsuranceServiceImpl implements InsuranceService {
	
	@Autowired
	private InsuranceRepository repo;

	@Override
	public void save(Insurance i) {
		
	}

	@Override
	public Insurance fetchByCoverageType(String coverage_type) {
		// TODO Auto-generated method stub
		return null;
	}

}
