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
		service.addCard(new Card(1, "dragon noir aux yeux bleus", "https://i.kym-cdn.com/entries/icons/facebook/000/025/526/gnome.jpg", 2400, 2200, 420, "very rare"));
		service.addCard(new Card(2, "dragon blanc aux yeux cramoisis", "https://i1.sndcdn.com/avatars-xNacgDtSXuLrmX9m-waCyKA-t500x500.jpg", 3000, 2600, 666, "extra rare"));
		System.out.println("Serveur démarré avec succès!");
		
		
	}
}
