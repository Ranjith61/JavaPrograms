package com.example.name.main;

import com.example.name.IRCTC;

public class IRCTCRunner {

	public static void main(String[] args) {
		
			IRCTC myIRCTCAccount = new IRCTC();

			myIRCTCAccount.setUserName("Ranjith");
			myIRCTCAccount.setFullName("Ranjith Reddy");
			myIRCTCAccount.setEmail("ranji21@gmail.com");
			myIRCTCAccount.setPhoneNumber("8088064463");
			myIRCTCAccount.setAddress("Banglore");
			myIRCTCAccount.setIdProofType("Aadhar Card");
			myIRCTCAccount.setIdProofNumber("5326632532873");
			myIRCTCAccount.setTicketsBooked(19);
			myIRCTCAccount.setCancellationCount(2);
			myIRCTCAccount.setLoyaltyPoints(100);
			myIRCTCAccount.setRegistered(true);
			myIRCTCAccount.setVerified(true);
			myIRCTCAccount.setLastLogin("9/7/2023 6:30");
			myIRCTCAccount.setPreferredLanguage("English");

			System.out.println("User Name: " + myIRCTCAccount.getUserName());
			System.out.println("Full Name: " + myIRCTCAccount.getFullName());
			System.out.println("Email: " + myIRCTCAccount.getEmail());
			System.out.println("Phone Number: " + myIRCTCAccount.getPhoneNumber());
			System.out.println("Address: " + myIRCTCAccount.getAddress());
			System.out.println("ID Proof Type: " + myIRCTCAccount.getIdProofType());
			System.out.println("ID Proof Number: " + myIRCTCAccount.getIdProofNumber());
			System.out.println("Tickets Booked: " + myIRCTCAccount.getTicketsBooked());
			System.out.println("Cancellation Count: " + myIRCTCAccount.getCancellationCount());
			System.out.println("Loyalty Points: " + myIRCTCAccount.getLoyaltyPoints());
			System.out.println("Registered: " + myIRCTCAccount.isRegistered());
			System.out.println("Verified: " + myIRCTCAccount.isVerified());
			System.out.println("Last Login: " + myIRCTCAccount.getLastLogin());
			System.out.println("Preferred Language: " + myIRCTCAccount.getPreferredLanguage());
		}

	}
