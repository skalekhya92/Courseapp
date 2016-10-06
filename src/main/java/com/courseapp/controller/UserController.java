package com.courseapp.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.courseapp.domain.User;
import com.courseapp.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userservice;
 
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> create_user(@Valid @RequestBody User user) throws Exception {
		return new ResponseEntity<User>(userservice.save(user), HttpStatus.CREATED);
	}




}
