package com.xworkz.app.impl;

import com.xworkz.app.repository.Jacket;

public class JacketImp implements Jacket {
	private String[] jac = new String[TOTAL_JACKETS];
	private int position;

	@Override
	public void store(String jacket) {
		System.out.println("Jackets");
		if (this.position < TOTAL_JACKETS) {
			this.jac[position] = jacket;
			System.out.println("Jacket name " + jacket + " position " + this.position);
			this.position++;
		} else {
			System.out.println("it is in out of index");
		}
	}

}
