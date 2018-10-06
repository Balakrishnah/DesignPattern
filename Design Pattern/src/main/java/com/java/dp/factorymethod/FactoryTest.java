package com.java.dp.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryTest {
	//Factory Method Pattern says that just define an interface or abstract class 
	//for creating an object but let the subclasses decide which class to instantiate. 
	public static void main(String[] args) throws IOException {
		System.out.println(" Please the entercomm of the plan which the bill will be generated");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String plan = br.readLine();
		System.out.println("Enter the nuber of units for bill  will be calculated:");
		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(System.in));
		String unit =br1.readLine();
		
		int units = Integer.parseInt(unit);
		Plan plan2 = PlanFactory.getPlan(plan);
		plan2.calculateBill(units);
	}
}
	