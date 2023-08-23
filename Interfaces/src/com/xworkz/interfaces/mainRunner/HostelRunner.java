package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.CollegeHostel;
import com.xworkz.interfaces.Hostel;
import com.xworkz.interfaces.main.HostelRules;

public class HostelRunner {
	
	public static void main(String[] args) {
		Hostel hostel = new HostelRules();
		hostel.name("Vookaligara sangha students hostel");
		hostel.strength(500);
		
		System.out.println("============");
		
		CollegeHostel hostel1 = new HostelRules();
		hostel1.name();
		hostel1.food(true);
		hostel1.price(20000);
	}

}
