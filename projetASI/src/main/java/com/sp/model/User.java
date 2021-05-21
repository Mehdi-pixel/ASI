package com.sp.model;

import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	protected String name;
	private String surname;
	protected String password;
	private String repassword;
	protected int money;
	
	public User() {
	}
	
	public User(String name,String surname,String password,String repassword, int money) {
		super();
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.repassword=repassword;
		this.money=money;
	}
	
	public Integer getId() {
		return id;
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
	public int getMoney() {
		return money;
	}
	public void earnMoney(int addedMoney) {
		this.money=+addedMoney;
	}
	public void loseMoney(int lostMoney) {
		this.money-=lostMoney;
	}

}
