package com.xworkz.Associations.app;

public class Pant {
	private String name;
	private Zip zip;
	
	public Pant(String name) {
		this.name=name;
	}
	
	public void setZip(Zip zip) {
		this.zip=zip;
	}
	
	public void manufacturer() {
		System.out.println("Invoking the manufacturer");
		this.zip.flyingMachine();
	}
	
	

}
