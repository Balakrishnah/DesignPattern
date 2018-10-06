package com.java.dp.proxy;

public class RealInternetAccess implements OfficeInternetAccess {
	private String empolyeeName;
	public RealInternetAccess(String empName) {
		this.empolyeeName = empName;
	}
	@Override
	public void grantInternetAccess() {
		System.out.println("Internet access granted for Employee: "+empolyeeName);

	}

}
