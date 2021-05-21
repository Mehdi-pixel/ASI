package com.sp;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.model.Card;
import com.sp.rest.CardrestCrt;

import org.springframework.data.repository.CrudRepository;
import com.sp.model.Card;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import java.util.Arrays;


@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(App.class,args);
		
		CardrestCrt service = applicationContext.getBean(CardrestCrt.class);
		int idcard=1;
		service.addCard(new Card("Uh Oh, you just got GNOMED", "https://i.kym-cdn.com/entries/icons/facebook/000/025/526/gnome.jpg", 2400, 2200, 420, "very rare"));
		idcard++;
		service.addCard(new Card("Joe-Kerh", "https://i1.sndcdn.com/avatars-xNacgDtSXuLrmX9m-waCyKA-t500x500.jpg", 3000, 2600, 666, "extra rare"));
		idcard++;
		service.addCard(new Card("Grand white wizard", "https://i.imgur.com/NMno4C7.jpg", 1800, 1500, 80, "rare"));
		idcard++;
		service.addCard(new Card("Student of the sword", "https://i.kym-cdn.com/entries/icons/original/000/018/170/847169841228430465.jpeg", 8000, 0, 1937, "ultra rare"));
		idcard++;
		service.addCard(new Card("D-egg-stroyer", "https://www.mypokecard.com/en/Gallery/my/galery/vfJJpCqplrM4.jpg", 0, 0, 1, "common"));
		idcard++;
		System.out.println("Serveur démarré avec succès!");
		
		
	}
}
