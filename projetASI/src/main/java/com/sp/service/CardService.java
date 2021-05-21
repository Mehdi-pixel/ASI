package com.sp.service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.Card;
import com.sp.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	CardRepository hRepository;
	
	public Card addCard(Card h) {
		hRepository.save(h);
		System.out.println(h);
		return h;
	}
	
	public Card getCard(int id) {
		Optional<Card> hOpt =hRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}
	
	//delete a Card from the existing list of cards
	public void gotoBrazil(int id) {
		hRepository.delete(hRepository.findById(id).get());
		System.out.println("Card removed.");
	}
	
	//fonction appelee par l'utilisateur
	public Card freeGiveAway() {
		//on prend une carte au pif
		ArrayList<Integer> listeIds = new ArrayList<Integer>();
		Iterable<Card> it = hRepository.findAll();
		it.forEach(Card -> {
		    listeIds.add(Card.getIdCard());
		});
		int randomNum = ThreadLocalRandom.current().nextInt(1, (int)listeIds.size());
		randomNum = listeIds.get(randomNum);
		
		Card freeCarte = hRepository.findById(randomNum).get();
		System.out.println("Carte gratuite: "+freeCarte);
		
		//on crée une copie qu'on ajoute à la liste des cartes existantes
		Card copy=new Card(freeCarte.getNameCard(), freeCarte.getImgUrl(), freeCarte.getAtk(), freeCarte.getDef(), freeCarte.getPrice(), freeCarte.getRarete());
		copy = addCard(copy);
		
		System.out.println("number of items in repository now: "+hRepository.count());
		return copy;
	}
	
	public Card copyCard(Card c) {
		Card c2 = new Card(c.getNameCard(), c.getImgUrl(), c.getAtk(), c.getDef(), c.getPrice(), c.getRarete());
		return c2;
	}
	
}
