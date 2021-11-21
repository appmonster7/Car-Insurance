package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.service.LoginService;

@CrossOrigin
@RestController
public class LoginRestController {
	@Autowired
	private LoginService login;
	@GetMapping(value = "/login")
	public String authenticateUser(@RequestParam String username , @RequestParam String password) {
		return login.Authenticate(username, password);
	}

}