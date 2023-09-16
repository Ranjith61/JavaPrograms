package com.xworkz.newspaper.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {

	private String name;
	private int number;
	private int cost;
	private String colour;
	
	

	public AadharDTO(String name, int number, int cost, String colour) {
		super();
		this.name = name;
		this.number = number;
		this.cost = cost;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "AadharDTO [name=" + name + ", number=" + number + ", cost=" + cost + ", colour=" + colour + "]";
	}

}
