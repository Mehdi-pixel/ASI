package com.sp.service;

import java.util.Optional;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
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
	
	public User getUserName(String name,String password) {
		List<User> uList =hRepository.findByName(name);
		Iterator<User> it = uList.iterator();
		while(it.hasNext()) {
		      User currentUser = it.next();
		      if (currentUser.getPassword() == password) {
		    	  System.out.print("Authentification réussie!");
		    	  return currentUser;
		      }
		}
	System.out.print("Authentification ratée :/");
	return null;
	}
}
