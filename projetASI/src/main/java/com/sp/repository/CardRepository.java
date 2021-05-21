package com.sp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.model.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {

	public List<Card> findByNameCard(String name);
	/*
	Class.forName("postgresql.Driver");
	
	String DBurl = "jdbc:postgresql://localhost/card";
	Connection con = DriverManager.getConnection(DBurl,"postgres","lama");
	*/
}
