package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.entity.User;
import com.ibm.repo.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public void save(User u) {
		repo.save(u);

	}

	@Override
	public User fetchById(int user_id) {
		return repo.findById(user_id).get();
	}

	@Override
	public List<User> fetchAll() {
		return repo.findAll();
	}

}
