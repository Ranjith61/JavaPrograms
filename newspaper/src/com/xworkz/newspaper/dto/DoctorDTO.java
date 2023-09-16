package com.xworkz.newspaper.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable {
	private String name;
	private int phoneNo;
	private int charges;
	private String place;

	public DoctorDTO(String name, int phoneNo, int charges, String place) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.charges = charges;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", phoneNo=" + phoneNo + ", charges=" + charges + ", place=" + place + "]";
	}

}
