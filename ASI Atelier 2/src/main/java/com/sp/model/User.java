package com.sp.model;

public class User {
	private int id;
	private String name;
	private String surname;
	private String password;
	private String repassword;
	
	public User() {
	}
	
	public User(int id,String name,String surname,String password,String repassword) {
		super();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.repassword=repassword;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void checkPassword(String password,String repassword) {
		String reponse;
		if (this.password==this.repassword) {
			reponse="True";
		}
		else {
			reponse="False";
			}
		System.out.println(reponse);
		}
}
