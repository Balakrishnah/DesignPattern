package com.java.dp.dependency.constructor.injection;

import com.java.dp.dependency.Address;

public class Employee {
	private int id;
	private String name;
	private Address address;// Aggregation

	public Employee() {
		System.out.println("defalut constructor");
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}
}
