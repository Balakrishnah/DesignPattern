package com.java.dp.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String employeeName;
	private RealInternetAccess realAccess;

	 public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if(getRole(employeeName) >0){
			realAccess = new RealInternetAccess(employeeName);
			realAccess.grantInternetAccess();
		}else{
			System.out.println(" No Internet Access granted. Your job level is below 5");
		}
	}
	
	public int getRole(String employeeName){
		if(employeeName.equalsIgnoreCase("sagar")){
			return 5;
		}else if(employeeName.equalsIgnoreCase("pk")){
			return 20;
		}
		return 0;
	}

}
