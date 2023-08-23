package com.xworkz.interfaces.main;

import com.xworkz.interfaces.Metro;

public class VijaynagarMetro implements Metro {

	@Override
	public void name() {
		System.out.println("Invoking the name of metro");
	}

	@Override
	public int ticket(double cost) {
		System.out.println("Invoking cost in VijaynagarMetro");
		return 50;
	}

	@Override
	public String security(boolean securityGood) {
		System.out.println("Invoking security in VijaynagarMetro");
		return null;
		
	}
	
}
