package com.java.dp.strategy;

public class StrategyDemo {
	/*A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".
	Benefits:
		It provides a substitute to subclassing.
		It defines each behavior within its own class, eliminating the need for conditional statements.
		It makes it easier to extend and incorporate new behavior without changing the application.
	Usage:
		When the multiple classes differ only in their behaviors.e.g. Servlet API.
		It is used when you need different variations of an algorithm.*/
	
	public static void main(String[] args) {
		Context context = new Context(new AdditionStrategy());
		float result = context.executeStrategy(10, 20);
		System.out.println(" The AdditionStrategy result is: " + result);
		
		Context context2 = new Context(new SubtractionStrategy());
		float result2 = context2.executeStrategy(30, 20);
		System.out.println(" The SubtractionStrategy result is: " + result2);
	}

}
