package com.java.dp.strategy;


public class StrategyDemo {

/*	Ref link- https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
  	Strategy design pattern is one of the behavioral design pattern. 
	Strategy pattern is used when we have multiple algorithm for a specific task and 
	client decides the actual implementation to be used at runtime.
	*/
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		Item item1 = new Item("123", 10);
		Item item2 = new Item("456", 20);
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		
		//pay by paypal
		shoppingCart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit card
		shoppingCart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}

}
