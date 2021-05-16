package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class TemplateCard {
	@Id
	@GeneratedValue
	private Integer idTemplate;
	private String nameTemplate;
	
	protected int Atk;
	protected int Def;
	protected String Rarete;
	protected int price;
	protected String imgUrl;
	
	public TemplateCard() {
		this.idTemplate =1;
		this.Atk = 100;
		this.Def = 100;
		this.Rarete = "";
		this.price = 5;
		this.imgUrl = "";
	}
	/*
	public TemplateCard(int idTCard, String name, String imgUrl, int atk, int def,  int price, String rare) {
		super();
		this.idTemplate = idTCard;
		this.nameTemplate = name;
		this.Atk = atk;
		this.Def = def;
		this.Rarete = rare;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	*/
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
	
	
	
}
