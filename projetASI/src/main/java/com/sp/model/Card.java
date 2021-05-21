package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {
	@Id
	@GeneratedValue
	private Integer idCard;
	private String nameCard;
	private Integer idTemplate;
	private String nameTemplate;
	
	protected int Atk;
	protected int Def;
	protected String Rarete;
	protected int price;
	protected String imgUrl;
	
	public Card() {
	}

	public Card(int id, String name, String imgUrl, int atk, int def, int price, String rare) {
		super();
		this.idCard = id;
		this.nameCard = name;
		this.Atk = atk;
		this.Def = def;
		this.Rarete = rare;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public Card(TemplateCard c) {
		idTemplate=c.getIdTemplate();
		nameTemplate=c.getNameTemplate();
		Atk=c.getAtk();
		Def=c.getDef();
		Rarete=c.getRarete();
		price=c.getPrice();
		imgUrl=c.getImgUrl();
	}
	

	public Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}
	
	

	public Integer getIdTemplate() {
		return idTemplate;
	}

	public void setIdTemplate(Integer idTemplate) {
		this.idTemplate = idTemplate;
	}

	public String getNameTemplate() {
		return nameTemplate;
	}

	public void setNameTemplate(String nameTemplate) {
		this.nameTemplate = nameTemplate;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	public void setDef(int def) {
		Def = def;
	}

	public String getRarete() {
		return Rarete;
	}

	public void setRarete(String rarete) {
		Rarete = rarete;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Card ["+this.idCard+"]: name:"+this.nameCard+", atk:"+this.Atk+", Def:"+this.Def+" price:"+this.price+" rarete:"+this.Rarete+" imgUrl:"+this.imgUrl;
	}
}
