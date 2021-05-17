package com.sp.model;

import java.util.ArrayList;
import java.util.Iterator;

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
	protected ArrayList<Card> Listecarte;
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
	public int getMoney() {
		return money;
	}
	public void earnMoney(int addedMoney) {
		this.money=+addedMoney;
	}
	public void loseMoney(int lostMoney) {
		this.money-=lostMoney;
	}
	public Card getCardById(Integer id) {
		Iterator<Card> it = Listecarte.iterator();
		while(it.hasNext()) {
		      Card currentCard = it.next();
		      if (currentCard.getIdCard().equals(id)) {
		    	  return currentCard;
		      }
		}
	System.out.println("Erreur ! Carte non trouvée");
	return null;
	}
	public void addCard(Card carte) {
		Listecarte.add(carte);
	}
	
	public void removeCardById(Integer id) {
		Iterator<Card> it = Listecarte.iterator();
		while(it.hasNext()) {
		      Card currentCard = it.next();
		      if (currentCard.getIdCard().equals(id)) {
		    	  Listecarte.remove(currentCard);
		      }
		}
	System.out.println("Erreur ! Carte non trouvée. Suppression annulée.");
	}

}
