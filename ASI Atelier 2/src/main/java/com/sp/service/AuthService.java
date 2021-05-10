package com.sp.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.loginUser;
import com.sp.repository.UserRepository;

public class AuthService {
	@Autowired
	UserService hService;
	
	public void logUser(loginUser loguser) {
		
	}
}
