package com.sp.rest;

  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;
  import org.springframework.web.bind.annotation.RestController;

  import com.sp.model.Card;
  import com.sp.service.CardService;

  @RestController
  public class CardrestCrt {
      @Autowired
      CardService hService;
      

      
      @RequestMapping(method=RequestMethod.POST,value="/addcard")
      public void addCard(@RequestBody Card card) {
          hService.addCard(card);
      }
      
      @RequestMapping(method=RequestMethod.GET,value="/getcard/{id}")
      public Card getCard(@PathVariable String id) {
    	  Card h=hService.getCard(Integer.valueOf(id));
          return h;
      }
      
      @RequestMapping(method=RequestMethod.GET,value="/deletecard/{id}")
      public void deleteCard(@PathVariable String id) {
    	  hService.gotoBrazil(Integer.valueOf(id));
      }
      
      @RequestMapping("/freecards")
      public Card freeGiveAway() {
    	  Card c = hService.freeGiveAway();
    	  System.out.println("free card");
    	  return c;
      }
      
      @RequestMapping("/hello")
    	public String sayHello() {
    		return "Hello world.";
    	}
      
  }
  

 
  	
  	

  