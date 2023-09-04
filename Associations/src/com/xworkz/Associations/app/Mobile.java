package com.xworkz.Associations.app;

public class Mobile {
	private String name;
	private Charger charger;

	public Mobile() {
		System.out.println("invoking all in mobile");
		this.name = name;
	}

	public void setCharger(Charger charger) {
		System.out.println("invoing main in set charger");
		this.charger = charger;
		this.charger.wire();
		this.charger.connect();
		this.charger.plug();
		this.charger.electric();
		
	}

	public void charging() {
		System.out.println("Invoking all in charging");
		
	}
}
