package com.xworkz.app.impl;

import com.xworkz.app.repository.Politician;

public class Polticimp implements Politician {
	private String[] pol = new String[TOTAL_POLITICIANS];
	private int position;

	@Override
	public void names(String politicians) {
		System.out.println("politicians");
		if (this.position < TOTAL_POLITICIANS) {
			this.pol[position] = politicians;
			System.out.println("Politician name " + politicians + " position " + this.position);
			this.position++;
		} else {
			System.err.println("this is in out of index");
		}
	}
}
