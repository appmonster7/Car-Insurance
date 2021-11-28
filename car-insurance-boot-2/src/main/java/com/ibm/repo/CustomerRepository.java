package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
}
