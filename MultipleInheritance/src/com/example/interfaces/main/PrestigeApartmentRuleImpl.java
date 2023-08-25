package com.example.interfaces.main;

import com.example.interfaces.ApartmentRule;

public class PrestigeApartmentRuleImpl implements ApartmentRule {

	@Override
	public void construct() {
		System.out.println("Running main in construct");
	}
	
	@Override
	public void PurchaseApartment() {
		System.out.println("Running main in PurchaseApartment");		
	}

	@Override
	public void BuildApartment() {
		System.out.println("Running main in BuildApartment");		
	}


	@Override
	public void apartment() {
		System.out.println("Running main in Apartment");		
		
	}

	public static void main(String[] args) {
		ApartmentRule apartment = new PrestigeApartmentRuleImpl();
		apartment.apartment();
		apartment.BuildApartment();
		apartment.PurchaseApartment();
		System.out.println("-----------");
		apartment.construct();
		
	}
}
