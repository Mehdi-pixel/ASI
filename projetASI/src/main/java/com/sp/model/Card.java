package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {
	@Id
	@GeneratedValue
	private Integer id;
	private String nameCard;
	private Integer idTemplate;
	private String nameTemplate;
	private int idOwner;
	
	protected int Atk;
	protected int Def;
	protected String Rarete;
	protected int price;
	protected String imgUrl;
	
	public Card() {
	}

	public Card(String name, String imgUrl, int atk, int def, int price, String rare) {
		super();
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
		return id;
	}

	public void setIdCard(Integer idCard) {
		this.id = idCard;
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
	
	public int getIdOwner() {
		return this.idOwner;
	}
	
	public void setIdOwner(int ido) {
		this.idOwner = ido;
	}

	@Override
	public String toString() {
		return "Card ["+this.id+"]: name:"+this.nameCard+", atk:"+this.Atk+", Def:"+this.Def+" price:"+this.price+" rarete:"+this.Rarete+" imgUrl:"+this.imgUrl;
	}
}
