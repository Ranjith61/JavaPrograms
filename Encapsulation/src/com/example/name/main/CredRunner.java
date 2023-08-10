package com.example.name.main;

import com.example.name.Cred;

public class CredRunner {

	public static void main(String[] args) {
		Cred myCredAccount = new Cred();

		myCredAccount.setUserName("Ranjith");
		myCredAccount.setFullName("Ranjith Reddy");
		myCredAccount.setEmail("ranjithkumar@gmail.com");
		myCredAccount.setPhoneNumber("8088064463");
		myCredAccount.setAddress("HSR Layout");
		myCredAccount.setCreditCardNumber("1234-5678-9012");
		myCredAccount.setCardExpirationDate("12/25");
		myCredAccount.setCardHolderName("Ranjith");
		myCredAccount.setBillingAddress("456 Billing, Bangalore");
		myCredAccount.setRewardsPoints(500);
		myCredAccount.setCreditLimit(10000.00);
		myCredAccount.setPremium(true);
		myCredAccount.setVerified(true);

		System.out.println("User Name: " + myCredAccount.getUserName());
		System.out.println("Full Name: " + myCredAccount.getFullName());
		System.out.println("Email: " + myCredAccount.getEmail());
		System.out.println("Phone Number: " + myCredAccount.getPhoneNumber());
		System.out.println("Address: " + myCredAccount.getAddress());
		System.out.println("Credit Card Number: " + myCredAccount.getCreditCardNumber());
		System.out.println("Card Expiration Date: " + myCredAccount.getCardExpirationDate());
		System.out.println("Card Holder Name: " + myCredAccount.getCardHolderName());
		System.out.println("Billing Address: " + myCredAccount.getBillingAddress());
		System.out.println("Rewards Points: " + myCredAccount.getRewardsPoints());
		System.out.println("Credit Limit: " + myCredAccount.getCreditLimit());
		System.out.println("Premium: " + myCredAccount.isPremium());
		System.out.println("Verified: " + myCredAccount.isVerified());
	}

}
	