package com.courseapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.domain.User;

import com.courseapp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository user_repository;

	public User save(User user) throws Exception {
		return user_repository.save(user);
	}

}
