package com.java.dp.templateMethod;

public class TemplateDemo {

	public static void main(String[] args) {
	HouseTemplate houseTemplate =  new WoodenHouse();
	// Using template method
	houseTemplate.buildHouse();
	houseTemplate.buildPillars();
	
	System.out.println();
	System.out.println("********************************************************");
	houseTemplate = new GlassHouse();
	houseTemplate.buildHouse();
	}

}
