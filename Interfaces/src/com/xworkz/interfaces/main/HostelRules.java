package com.xworkz.interfaces.main;

import com.xworkz.interfaces.CollegeHostel;
import com.xworkz.interfaces.Hostel;

public class HostelRules implements Hostel, CollegeHostel {

	@Override
	public void name() {
		System.out.println("Invoking main in name");
	}

	@Override
	public String food(boolean foodIsGood) {
		System.out.println("Invoking main in food");
		return "Good";
	}

	@Override
	public int price(int fee) {
		System.out.println("Invoking main in fee");
		return 6000;
	}

	@Override
	public String name(String nameOfHostel) {
		System.out.println("Invoking main in name of hostel");
		return "VSFH";
	}

	@Override
	public int strength(int capacity) {
		System.out.println("Invoking main in strength");
		return 10000;
	}
	
	

}
