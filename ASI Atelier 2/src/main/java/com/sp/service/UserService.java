package com.sp.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository hRepository;
	public void addUser(User h) {
		if (h.getPassword().contentEquals(h.getRepassword())) {
			System.out.println("Mot de passe valide");
			User createdUser=hRepository.save(h);
			System.out.println(createdUser);
		} else {
			System.out.println("Erreur inscription");
		}
		
	}
	
	public User getUser(int id) {
		Optional<User> hOpt =hRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}
}
