package com.sp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.sp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);
}
