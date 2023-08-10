package com.example.name.main;

import com.example.name.NammaMetro;

public class NammametroRunner {

	public static void main(String[] args) {
		NammaMetro myMetroTicket = new NammaMetro();

		myMetroTicket.setUserName("Caharan");
		myMetroTicket.setFullName("Charan Kumar");
		myMetroTicket.setEmail("charan@gmail.com");
		myMetroTicket.setPhoneNumber("76356414893");
		myMetroTicket.setSourceStation("whitefield");
		myMetroTicket.setDestinationStation("Banashankari");
		myMetroTicket.setTravelDate("9/8/2023");
		myMetroTicket.setTicketNumber("NM123456");
		myMetroTicket.setNumberOfPassengers(1);
		myMetroTicket.setTotalFare(30.00);
		myMetroTicket.setTravelClass("Standard");
		myMetroTicket.setRoundTrip(false);
		myMetroTicket.setCancelled(false);

		System.out.println("User Name: " + myMetroTicket.getUserName());
		System.out.println("Full Name: " + myMetroTicket.getFullName());
		System.out.println("Email: " + myMetroTicket.getEmail());
		System.out.println("Phone Number: " + myMetroTicket.getPhoneNumber());
		System.out.println("Source Station: " + myMetroTicket.getSourceStation());
		System.out.println("Destination Station: " + myMetroTicket.getDestinationStation());
		System.out.println("Travel Date: " + myMetroTicket.getTravelDate());
		System.out.println("Ticket Number: " + myMetroTicket.getTicketNumber());
		System.out.println("Number of Passengers: " + myMetroTicket.getNumberOfPassengers());
		System.out.println("Total Fare: " + myMetroTicket.getTotalFare());
		System.out.println("Travel Class: " + myMetroTicket.getTravelClass());
		System.out.println("Round Trip: " + myMetroTicket.isRoundTrip());
		System.out.println("Cancelled: " + myMetroTicket.isCancelled());
	}

}
	