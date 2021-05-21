package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.Card;
import com.sp.model.User;
import com.sp.service.CardService;
import com.sp.service.UserService;

@RestController
public class UserRestCrt {
	
	@Autowired
	UserService userService;
	@Autowired
	CardService hService;
	
	@RequestMapping("/user")
	public User sayHello() {
		return userService.getUser(1);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/adduser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
		User newUser = userService.getUser(user.getId());
		for (int i=0;i<3;i++) {
			Card freeCarte = hService.freeGiveAway();
			freeCarte.setIdOwner(newUser.getId());
		}
	}

}
