package com.sp.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;

@RestController
public class AuthRestCrt {
	@RequestMapping("/userlog")
	public String sayHello() {
		return "Hello User";
	}
	
}
