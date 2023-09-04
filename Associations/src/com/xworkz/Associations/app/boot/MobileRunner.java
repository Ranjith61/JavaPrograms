package com.xworkz.Associations.app.boot;

import com.xworkz.Associations.app.Charger;
import com.xworkz.Associations.app.Mobile;

public class MobileRunner {
	public static void main(String[] args) {
		String name = "Umanth";
		System.out.println(name);
		Mobile mob = new Mobile();
		Charger charg = new Charger();
		mob.charging();
		mob.setCharger(charg);
		
		}

}
