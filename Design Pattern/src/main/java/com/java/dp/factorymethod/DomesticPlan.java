package com.java.dp.factorymethod;

public class DomesticPlan extends Plan {
	public DomesticPlan() {
	}

	@Override
	void getRate() {
		rate = 3.5;
	}
}
