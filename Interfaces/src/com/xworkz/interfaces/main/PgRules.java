package com.xworkz.interfaces.main;

import com.xworkz.interfaces.Pg;

public class PgRules implements Pg {

	@Override
	public String name(String nameOfPg) {
		System.out.println("Invoking name in PgRules");
		return "gents pg";
	}

	@Override
	public int price(double amount) {
		System.out.println("Invoking price in PgRules");
		return 80000;
	}

	@Override
	public void rooms() {
		System.out.println("Invoking rooms in PgRules");
		
	}
	

}
