package com.xworkz.app.repository;

public class JuicerepsitoryImpl implements Juice {
	String[] str = new String[TOTAL_VALUE];
	private int position;

	@Override
	public void store(String name) {
		this.str[position] = name;// expli
		
		System.out.println("item name is" + name + "the position is" + position);
		this.position++;

	}

	public boolean isExist(String name) {
		for (int i = 0; i <= this.position; i++) {
			String temp = str[i];
			if (temp != null && temp.equals(name)) {
				return true;
			}
			else {
				System.err.println("it is same");
			}
		}
		return false;
	}

}
