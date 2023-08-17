package com.ranjith.app;

public class Flag {
	
	private String color;
	private int height;
	private boolean isIndianFlag;	
	
	public Flag() {
		
	}

	public Flag(String color, int height, boolean isIndianFlag) {
		super();
		this.color = color;
		this.height = height;
		this.isIndianFlag = isIndianFlag;
	}

	@Override
	public String toString() {
		return "color=" + color + ", height=" + height + ", isIndianFlag=" + isIndianFlag;
	}
	
	
	

}
