package com.java.dp.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
 /*Prototype Pattern says that cloning of an existing object instead of creating new one and 
		can also be customized as per the requirement.*/
	
	/*Usage of Prototype Pattern:
	a)When the classes are instantiated at runtime.
	b)When the cost of creating an object is expensive or complicated.
	c)When you want to keep the number of classes in an application minimum.
	d)When the client application needs to be unaware of object creation and representation.*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Enter the EmployeeId :");
	int eId = Integer.parseInt(br.readLine());
	System.out.println("\n");
	
	System.out.println("Enter EmployeeName :");
	String eName =br.readLine();
	System.out.println("\n");
	
	System.out.println("Enter Designation :");
	String eDesignation = br.readLine();
	System.out.println("\n");
	
	System.out.println("Enter Salary : ");
	int eSalary = Integer.parseInt(br.readLine());
	System.out.println("\n");
	
	System.out.println(" Enter the Address: ");
	String eAddress = br.readLine();
	System.out.println("\n");
	
	EmployeeRecord employeeRecord =  new EmployeeRecord(eId, eName, eDesignation, eSalary, eAddress);
	employeeRecord.showRecord();
	
	EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord.getClone();
	employeeRecord2.showRecord();
	}

}
