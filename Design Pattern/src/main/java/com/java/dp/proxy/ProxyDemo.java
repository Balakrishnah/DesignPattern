package com.java.dp.proxy;

public class ProxyDemo {
	/*Proxy Pattern "provides the control for accessing the original object".*/
	
	//Advantages:
	/*
	a)It provides the protection to the original object from the outside world.
	b)we can perform many operations like hiding the information of original object, on demand loading etc.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("babu");
    officeInternetAccess.grantInternetAccess();
	}

}
