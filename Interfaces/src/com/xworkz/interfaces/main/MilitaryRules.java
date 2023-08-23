package com.xworkz.interfaces.main;

import com.xworkz.interfaces.Military;

public class MilitaryRules implements Military{

	@Override
	public void peroid() {
		System.out.println("Invoing period in MilitaryRules");
	}

	@Override
	public String name(String nameofMilitary) {
		System.out.println("Invoing name in MilitaryRules");
		return "Air Force";
	}

	@Override
	public String security(boolean isGood) {
		System.out.println("Invoing security in MilitaryRules");
		return "Good";
	}
	
}
