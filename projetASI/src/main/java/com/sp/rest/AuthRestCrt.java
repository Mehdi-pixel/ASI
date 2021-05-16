package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;
import com.sp.model.loginUser;
import com.sp.service.AuthService;

@RestController
public class AuthRestCrt {
	
	@Autowired
	AuthService LogService;
	@RequestMapping(method=RequestMethod.POST,value="/loguser")
	public User logUser(@RequestBody loginUser loguser) {
		return LogService.logUser(loguser);
	}
	
}
