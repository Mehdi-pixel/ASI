package com.sp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.TemplateCard;
import com.sp.repository.CardTemplateRepository;

@Service
public class CardTemplateService {
	@Autowired
	CardTemplateRepository hRepository;
	
	public void addCardTemplate(TemplateCard h) {
		TemplateCard createdCard=hRepository.save(h);
		System.out.println(createdCard);
	}
	
	public TemplateCard getCardTemplate(int id) {
		Optional<TemplateCard> hOpt =hRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}

}
