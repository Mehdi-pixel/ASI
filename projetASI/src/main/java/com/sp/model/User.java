package com.sp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	protected String name;
	private String surname;
	protected String password;
	private String repassword;
	protected List<Card> Listecarte;
	protected int money;
	
	public User() {
	}
	
	public User(Integer id,String name,String surname,String password,String repassword) {
		super();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.repassword=repassword;
		this.money=500;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getRepassword() {
		return repassword;
	}

}
