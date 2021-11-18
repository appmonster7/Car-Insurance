package com.ibm.service;

import java.util.List;

import com.ibm.entity.User;

public interface UserService {
	
	void save(User u);
	
	User fetchById(int user_id);
	
	List<User> fetchAll();

}
