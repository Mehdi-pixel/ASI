package com.sp.repository;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
