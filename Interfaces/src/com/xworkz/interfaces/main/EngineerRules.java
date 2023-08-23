package com.xworkz.interfaces.main;

import com.xworkz.interfaces.Engineer;

public class EngineerRules implements Engineer {

	@Override
	public void name() {
		System.out.println("Invoking name in EngineerRules");
	}

	@Override
	public String job(boolean technical) {
		System.out.println("Invoking job in EngineerRules");
		return null;
	}

	@Override
	public int salary(double amount) {
		System.out.println("Invoking salary in EngineerRules");
		return 0;
	}
	

}
