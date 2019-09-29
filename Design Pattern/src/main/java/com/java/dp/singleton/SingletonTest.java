package com.java.dp.singleton;


public class SingletonTest {
	
	/*Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it"
	
	Advantage of Singleton design pattern:
	Saves memory because object is not created at each request. Only single instance is reused again and again.
	
	Usage of Singleton design pattern:
	Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, 
	                  thread pools, configuration settings etc.*/
	public static void main(String[] args) {
	 SingletonInstance instance = SingletonInstance.getInstance();
	 instance.testingSingleton();
	}

}
