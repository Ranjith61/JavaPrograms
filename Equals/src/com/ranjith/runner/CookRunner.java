package com.ranjith.runner;

import com.ranjith.app.Cook;

public class CookRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CookRunner");

		Cook cook = new Cook("Vinod", 55, "vada", 3, true, false);
		System.out.println(cook);

		Cook cook1 = new Cook("Vinod", 55, "vada", 3, true, true);
		System.out.println(cook1);
		System.out.println("*************************");

		boolean same = cook.equals(cook1);
		System.out.println("Contents are same:" + same);

	}

}


