package com.sp.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.model.loginUser;
import com.sp.repository.UserRepository;

@Service
public class AuthService {
	@Autowired
	UserService hService;
	
	public User logUser(loginUser loguser) {
		return hService.getUserName(loguser.getName(), loguser.getPassword());
	}
}
