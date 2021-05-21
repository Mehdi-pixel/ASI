package com.sp.service;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.App;
import com.sp.model.Card;
import com.sp.model.User;
import com.sp.repository.CardRepository;
import com.sp.repository.MarketRepository;
import com.sp.repository.UserRepository;

@Service
public class MarketService {
	@Autowired
	MarketRepository mRepository;
	@Autowired
	UserRepository uRepository;
	@Autowired
	CardRepository hRepository;
	
	public void sellCard(Integer idCard, Integer idUserSelling) {
		//on recup l'utilisateur qui veut vendre
		User user = uRepository.findById(idUserSelling).get();
		
		System.out.println("here");
		//on recupere la carte qu'il veut vendre
		Card c = hRepository.findById(idCard).get();
		
		System.out.println("there");
		//on met la carte sur le marché
		Card soldCard=mRepository.save(c);
		
		System.out.println("now");
		System.out.println("user money before: "+user.getMoney());
		//on donne l'argent à l'utilisateur
		user.earnMoney(soldCard.getPrice());
		System.out.println("user money after: "+user.getMoney());
		
		System.out.println("and then");
		//on supprime la carte de sa liste de cartes
		c.setIdOwner(-1);
		
		System.out.println("La carte: "+soldCard+"a été mise sur le marché.");
	}
	
	public Card buyCard(Integer idCard, Integer idUserBuying) {
		//on recupere l'utilisateur qui veut acheter
		User user = uRepository.findById(idUserBuying).get();
		
		//on recupere le prix de la carte
		Card c = mRepository.findById(idCard).get();
		int prix = c.getPrice();
		
		//on check s'il a assez d'argent
		if (user.getMoney() >= prix) {
			//s'il a assez, on lui ajoute la carte dans sa liste de cartes
			c.setIdOwner(user.getId());
		
			//on lui deduit le prix de la carte de sa balance actuelle
			user.loseMoney(prix);
		
			//on retire la carte du marché
			mRepository.delete(c);
		}else {
			return null;
		}
		
		System.out.println("La carte: "+c+"a été achetée par "+user.getName());
		return c;
	}
	
	public void getAllCards() {
		Iterable<Card> it = mRepository.findAll();
		it.forEach(Card -> {
		    System.out.println(Card);
		});
	}
	
}
