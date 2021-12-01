/**
 * This service class describes all the methods and functionalities of the Customer entity.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;

public interface CustomerService {

	void save(Customer c);

	Customer fetchById(int customer_id);

	List<Customer> fetchAll();

}
