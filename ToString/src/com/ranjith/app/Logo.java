package com.ranjith.app;

public class Logo {
	private String companyName;
	private String designer;
	private String color;
	private boolean lookingGood;
	private String logoImage;
	
	public Logo() {
		super();
	}
	
	public Logo(String companyName, String designer, String color, boolean lookingGood, String logoImage) {
		super();
		this.companyName = companyName;
		this.designer = designer;
		this.color = color;
		this.lookingGood = lookingGood;
		this.logoImage = logoImage;
	}

	@Override
	public String toString() {
		return "companyName=" + companyName + ", designer=" + designer + ", color=" + color + ", lookingGood="
				+ lookingGood + ", logoImage=" + logoImage;
	}
	
	
	
	

}
