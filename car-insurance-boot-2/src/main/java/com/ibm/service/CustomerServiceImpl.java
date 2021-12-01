/**
 * This service Implementation class implements all the methods and functionalities of the Customer Service interface.
 * @author Kosuru.Venkata.Sravani,  P.M.Thanusree   
 * @version  1.8.0_311
 **/

package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;

@Service
@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public void save(Customer c) {
		repo.save(c);
	}

	@Override
	public Customer fetchById(int customerId) {
		return repo.findById(customerId).get();
	}

	@Override
	public List<Customer> fetchAll() {
		return repo.findAll();
	}

}
