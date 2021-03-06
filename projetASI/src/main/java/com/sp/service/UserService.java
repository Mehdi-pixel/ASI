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
	UserRepository userRepository;
	public void addUser(User h) {
		if (h.getPassword().contentEquals(h.getRepassword())) {
			System.out.println("Mot de passe valide");
			User createdUser=userRepository.save(h);
			System.out.println(createdUser.getName());
		} else {
			System.out.println("Erreur inscription");
		}
		
	}
	
	public User getUser(Integer id) {
		Optional<User> hOpt =userRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}
	
	public User getUserName(String name,String password) {
		List<User> uList =userRepository.findByName(name);
		Iterator<User> it = uList.iterator();
		while(it.hasNext()) {
		      User currentUser = it.next();
		      if (currentUser.getPassword().equals(password)) {
		    	  System.out.println("Authentification réussie!");
		    	  return currentUser;
		      }
		}
	System.out.println("Authentification ratée :/");
	return null;
	}
}
