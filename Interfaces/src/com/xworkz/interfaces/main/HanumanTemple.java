package com.xworkz.interfaces.main;

import com.xworkz.interfaces.Temple;

public class HanumanTemple implements Temple {

	@Override
	public String name(String templeName) {
		System.out.println("Invoking the templename");
		return "Temple";
	}

	@Override
	public int entryFee(int amount) {
		System.out.println("Invoking the Entry Fee");
		return 55;
	}

	@Override
	public int prasadamTime(int timings) {
		System.out.println("Invoking the prasadamTimings");
		return 12;
	}

}
