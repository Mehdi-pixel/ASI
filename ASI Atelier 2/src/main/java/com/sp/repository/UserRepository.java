package com.sp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.sp.model.User;

public class UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);
}
