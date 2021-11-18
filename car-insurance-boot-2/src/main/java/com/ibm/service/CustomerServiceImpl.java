package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;


public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public void save(Customer c) {
		repo.save(c);
	}

	@Override
	public Customer fetchById(int customer_id) {
		return repo.findById(customer_id).get();
	}

	@Override
	public List<Customer> fetchByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Customer> fetchAll() {
		return repo.findAll();
	}

	

}
