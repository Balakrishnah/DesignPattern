package com.java.dp.factorymethod;

import java.io.IOException;

public class FactoryTest {
	/*Factory Design Pattern is one of the popular Creational Design Patterns.

	The main aim of Factory Design Pattern is that separate objects or instances creation logic from client. 
	We implement Object creation logic in a Factory class without exposing that logic to the client.

	Factory Design Pattern is also know as Factory Method Design Pattern. 
	It is used when we have a super class with multiple sub-classes and based on input, 
	we need to return one of the sub-class. */
	public static void main(String[] args) throws IOException {
		System.out.println(" Please the entercomm of the plan which the bill will be generated");
		
		Plan plan2 = PlanFactory.getPlan("DOMESTICPLAN");
		plan2.calculateBill(10);
	}
}
	