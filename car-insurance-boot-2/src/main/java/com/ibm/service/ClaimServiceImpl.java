package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Claim;
import com.ibm.repo.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {
	@Autowired
	private ClaimRepository repo;
	
	@Override
	public void save(Claim c) {
		repo.save(c);
	}

}
