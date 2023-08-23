package com.xworkz.interfaces.mainRunner;

import com.xworkz.interfaces.Military;
import com.xworkz.interfaces.main.MilitaryRules;

public class MilitaryRunner {
	public static void main(String[] args) {
		Military military = new MilitaryRules();
		military.peroid();
		military.name("Air Force");
		military.security(true);
		
	}



}
