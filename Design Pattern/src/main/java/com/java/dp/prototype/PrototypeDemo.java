package com.java.dp.prototype;

import java.io.IOException;

public class PrototypeDemo {
	 /*Prototype Pattern says that cloning of an existing object instead of creating new one and 
			can also be customized as per the requirement.*/
	
	/*
	 The main advantages of prototype pattern are as follows:
		It reduces the need of sub-classing.
		It hides complexities of creating objects.
		The clients can get new objects without knowing which type of object it will be.
		It lets you add or remove objects at runtime.
		
	Usage of Prototype Pattern:
		a)When the classes are instantiated at runtime.
		b)When the cost of creating an object is expensive or complicated.
		c)When you want to keep the number of classes in an application minimum.
		d)When the client application needs to be unaware of object creation and representation.*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
	EmployeeRecord employeeRecord =  new EmployeeRecord(203359, "babu", "practitioner", 18000, "Bangalore");
	System.out.println("employeeRecord hashcode is "+ employeeRecord.hashCode());
	employeeRecord.showRecord();
	System.out.println("************************");
	EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord.getClone();
	employeeRecord2.showRecord();
	System.out.println("employeeRecord2 hashcode is "+ employeeRecord2.hashCode());
	}

}
