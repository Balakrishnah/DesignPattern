package com.java.dp.singleton;

public class ThreadSafetyTest {

	public static void main(String[] args) {
		ThreadSafetyInSingleton instance =  ThreadSafetyInSingleton.getInstance();
		System.out.println(instance);
		ThreadSafetyInSingleton instance1 =  ThreadSafetyInSingleton.getInstance();
		System.out.println(instance1);
	}

}
