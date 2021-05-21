package com.sp.service;

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
	
	public void addCard(Card h) {
		Card createdCard=hRepository.save(h);
		System.out.println(createdCard);
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
		System.out.println("NOOOOOOOOOOOO, I DONT WANT TO GO TO BRAAAAAAAAAAAAAAAAAAZIL");
	}
	
	//fonction appelee par l'utilisateur
	public Card freeGiveAway() {
		//on prend une carte au pif et on la renvoit
		System.out.println("number of items in repository: "+hRepository.count());
		int randomNum = ThreadLocalRandom.current().nextInt(1, (int)hRepository.count()+1);
		Card freeCarte =hRepository.findById(randomNum).get();
		System.out.println("Here are your free cards!");
		return freeCarte;
	}
	
}
