package com.java.dp.singleton;

public class ThreadSafetyInSingleton {
	private static volatile ThreadSafetyInSingleton instance;
	private static Object mutex = new Object();

	private ThreadSafetyInSingleton() {};

	public static ThreadSafetyInSingleton getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null) {
					instance = new ThreadSafetyInSingleton();
				}
			}
		}
		return instance;
	}
}
