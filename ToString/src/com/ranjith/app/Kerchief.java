package com.ranjith.app;

public class Kerchief {
	private String brand;
	private String type;
	private int price;
	private String color;
	private boolean washable;
	private int size;
	private boolean isEmbroidery;
	
	public Kerchief() {
		
	}

	public Kerchief(String brand, String type, int price, String color, boolean washable, int size,
			boolean isEmbroidery) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.washable = washable;
		this.size = size;
		this.isEmbroidery = isEmbroidery;
		
	}

	@Override
	public String toString() {
		return "Brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color + ", washable="
				+ washable + ", size=" + size + ", isEmbroidery=" + isEmbroidery;
	}
	
}
