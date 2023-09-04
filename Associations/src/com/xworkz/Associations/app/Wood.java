package com.xworkz.Associations.app;

public class Wood {
	public String name;
	public Paper paper;

	public Wood(String name) {
		this.name = name;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;

	}

	public void trees() {
		System.out.println("Invkoing the trees");
		this.paper.barnd();
	}

}
