package com.xworkz.Associations.app;

public class Shirt {
	private String name;
	private Button button;

	public Shirt(String name) {
		this.name = name;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void shop() {
		System.out.println("invoing the shop");
		this.button.shape();

	}

}
