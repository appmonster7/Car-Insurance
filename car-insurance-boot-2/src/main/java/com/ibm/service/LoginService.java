/**
 * This service class describes all the methods and functionalities of the Login entity.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.service;

import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;

public interface LoginService {

	Customer Authenticate(String email, String password);

}
