package com.java.dp.singleton;

public class PreventSingletonFromCloning implements Cloneable {
	private static PreventSingletonFromCloning instance;
	private PreventSingletonFromCloning(){}
	public static PreventSingletonFromCloning getInstance(){
		if(instance ==null){
			instance = new PreventSingletonFromCloning();
		}
		return instance;		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton doesn't support cloning ");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		PreventSingletonFromCloning fromCloning = PreventSingletonFromCloning.getInstance();
		System.out.println("Instance1 hashcode: "+fromCloning.hashCode());
		PreventSingletonFromCloning fromCloning2 = (PreventSingletonFromCloning) fromCloning.clone();
		System.out.println("Instance2 hashcode: "+fromCloning2.hashCode());
	}

}
