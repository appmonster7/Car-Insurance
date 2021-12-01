/**
 * This Rest Controller class is handles requests made by the client.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Customer;
import com.ibm.service.LoginService;

@CrossOrigin
@RestController
public class LoginRestController {
	@Autowired
	private LoginService login;

	@GetMapping(value = "/login")
	public Customer authenticateUser(@RequestParam String username, @RequestParam String password) {
		return login.Authenticate(username, password);
	}

}
