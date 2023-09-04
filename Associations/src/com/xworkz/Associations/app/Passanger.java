package com.xworkz.Associations.app;

public class Passanger {
	private String name;
	private Bus bus;
	
	public Passanger(String name) {
		this.name=name;
	}
	
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public void train() {
		System.out.println("Invoing the train");
		this.bus.passanger();
	}

}
