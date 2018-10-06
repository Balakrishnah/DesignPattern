package com.java.dp.templateMethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("building Wooden walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
		
	}

}
