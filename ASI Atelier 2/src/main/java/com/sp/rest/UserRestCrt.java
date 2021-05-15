package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;
import com.sp.service.UserService;

@RestController
public class UserRestCrt {
	
	@Autowired
	UserService hService;
	@RequestMapping("/user")
	public User sayHello() {
		return hService.getUser(1);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public void addUser(@RequestBody User user) {
		hService.addUser(user);
		hService.getUser(1);
	}

}
