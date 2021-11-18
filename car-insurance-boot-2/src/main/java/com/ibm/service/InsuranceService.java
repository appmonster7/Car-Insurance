package com.ibm.service;

import com.ibm.entity.Insurance;

public interface InsuranceService {
	void save(Insurance i);
	
	Insurance fetchByCoverageType(String coverage_type);
}
