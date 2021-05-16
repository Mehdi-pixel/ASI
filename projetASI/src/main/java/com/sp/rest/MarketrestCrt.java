package com.sp.rest;

  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;
  import org.springframework.web.bind.annotation.RestController;

  import com.sp.model.Card;
  import com.sp.service.CardService;
import com.sp.service.MarketService;

  @RestController
  public class MarketrestCrt {
      @Autowired
      MarketService mService;
      
      @RequestMapping(method=RequestMethod.GET,value="/sellcard/{idCard}/{idUserSelling}")
      public void sellcard(@RequestBody String idCard, @RequestBody String idUserSelling) {
          mService.sellCard(Integer.valueOf(idCard), Integer.valueOf(idUserSelling));
      }
      
      @RequestMapping(method=RequestMethod.GET,value="/buycard/{idCard}/{idUserBuying}")
      public Card buycard(@RequestBody String idCard, @RequestBody String idUserBuying) {
    	  Card c=mService.buyCard(Integer.valueOf(idCard), Integer.valueOf(idUserBuying));
          return c;
      }
     
      
  }
  

 
  	
  	

  