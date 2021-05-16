package com.sp.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository hRepository;
	@Autowired
	AuthService aService;
	public void addUser(User h) {
		if (h.getPassword().contentEquals(h.getRepassword())) {
			System.out.println("Mot de passe valide");
			User createdUser=hRepository.save(h);
			System.out.println(createdUser.getName());
		} else {
			System.out.println("Erreur inscription");
		}
		
	}
	
	public User getUser(Integer id) {
		Optional<User> hOpt =hRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}
	
	public List<User> getUserName(String name,String password) {
		List<User> uList =hRepository.findByName(name);
		//Parcours de la liste
		return uList;
	}
}
