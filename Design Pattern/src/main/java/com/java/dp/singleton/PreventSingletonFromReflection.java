package com.java.dp.singleton;

enum SingletonEnum {
	INSTANCE;
	private int value;
	private String name;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class PreventSingletonFromReflection {
	public static void main(String[] args) {
		SingletonEnum  instance = SingletonEnum.INSTANCE;
		instance.setValue(10);
		instance.setName("Babu");
		SingletonEnum  instance1 = SingletonEnum.INSTANCE;
		
		System.out.println("Instance hashcode: "+instance.hashCode());
		System.out.println("Instance1 hashcode: "+instance1.hashCode());
		System.out.println("Singleton enum value: "+instance.getValue());
		System.out.println("Singleton enum Name: "+instance.getName());
	}
	
	
}
