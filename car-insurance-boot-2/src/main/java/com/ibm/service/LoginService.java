package com.ibm.service;

import org.springframework.stereotype.Service;


public interface LoginService {
	
	String Authenticate(String email,String password);

}
