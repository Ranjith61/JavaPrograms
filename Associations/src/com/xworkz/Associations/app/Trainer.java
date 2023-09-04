package com.xworkz.Associations.app;

public class Trainer {
	private String name;
	private Laptop laptop;

	public Trainer(String name) {
		this.name = name;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void training() {
		System.out.println("Invoking the training");
		this.laptop.rom();
	}
}
