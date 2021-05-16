package com.sp.service;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.sp.App;
import com.sp.model.Card;
import com.sp.repository.CardRepository;
import com.sp.repository.MarketRepository;

@Service
public class MarketService {
	@Autowired
	MarketRepository mRepository;
	
	public void sellCard(int idCard, int idUserSelling) {
		//on recup l'utilisateur qui veut vendre
		//User user = userRepository.findById(idUserSelling).get();
		
		//on recupere la carte qu'il veut vendre
		//Card c = user.getCardById(idCard);
		
		//on met la carte sur le marché
		//Card soldCard=mRepository.save(c);
		
		//on donne l'argent à l'utilisateur
		//user.setMoney(soldCard.getPrice());
		
		//on supprime la carte de sa liste de cartes
		//user.deleteCardById(idCard);
		
		//System.out.println("La carte: "+soldCard+"a été mise sur le marché.");
	}
	
	public Card buyCard(int idCard, int idUserBuying) {
		//on recupere l'utilisateur qui veut acheter
		//User user = userRepository.findById(idUserSelling).get();
		
		//on recupere le prix de la carte
		//Card c = mRepository.findById(idCard).get();
		//int prix = c.getPrice();
		
		//on check s'il a assez d'argent
		//if (user.getBalance() >= prix) {
			//s'il a assez, on lui ajoute la carte dans sa liste de cartes
			//user.giveCarte(c);
		
			//on lui deduit le prix de la carte de sa balance actuelle
			//user.setBalance(user.getBalance()-prix);
		
			//on retire la carte du marché
			//mRepository.delete(c);
		//}else {
		//	return null;
		//}
		
		//System.out.println("La carte: "+c+"a été achetée par "+user.getName());
		//return c;
		return null;
	}
	
	public void getAllCards() {
		Iterable<Card> it = mRepository.findAll();
		it.forEach(Card -> {
		    System.out.println(Card);
		});
	}
	
}
