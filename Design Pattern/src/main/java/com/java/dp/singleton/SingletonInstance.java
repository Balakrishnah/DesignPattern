package com.java.dp.singleton;

public class SingletonInstance {
private static SingletonInstance instance = null;
private SingletonInstance(){}

public static SingletonInstance getInstance(){
	if(null == instance){
		synchronized (SingletonInstance.class) {
			if(null == instance){
				instance = new SingletonInstance();	
			}
		}
	}	
	return instance;	
}
public void testingSingleton(){
	System.out.println("Using the Singleton Instance for invoking this method");
}
}
