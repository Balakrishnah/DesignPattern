package com.java.dp.factorymethod;

import java.io.IOException;

public class FactoryTest {
	/*A Factory Pattern says that just define an interface or abstract class for creating an object but let the 
	 			subclasses decide which class to instantiate.
	 			
	 Advantage of Factory Design Pattern:
		Factory Method Pattern allows the sub-classes to choose the type of objects to create.
		It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.
	
	 Usage of Factory Design Pattern:
		When a class doesn't know what sub-classes will be required to create
		When a class wants that its sub-classes specify the objects to be created.
		When the parent classes choose the creation of objects to its sub-classes.*/
	public static void main(String[] args) throws IOException {
		System.out.println(" Please the entercomm of the plan which the bill will be generated");
		
		Plan plan2 = PlanFactory.getPlan("DOMESTICPLAN");
		plan2.calculateBill(10);
	}
}
	