package com.example.name.main;

import com.example.name.Ola;

public class OlaRunner {
	public static void main(String[] args) {
		Ola myOlaRide = new Ola();

		myOlaRide.setUserName("Likith");
		myOlaRide.setFullName("Likith Gowda");
		myOlaRide.setEmail("likith@gmail.com");
		myOlaRide.setPhoneNumber("+91 78723625303");
		myOlaRide.setPickupLocation("PG");
		myOlaRide.setDropLocation("Office");
		myOlaRide.setRideType("Mini");
		myOlaRide.setCarModel("kia");
		myOlaRide.setDriverName("lohith");
		myOlaRide.setRideFare(150.00);
		myOlaRide.setDistanceTraveled(10.5);
		myOlaRide.setRating(4);
		myOlaRide.setRideCompleted(true);
		myOlaRide.setPaymentDone(true);

		System.out.println("User Name: " + myOlaRide.getUserName());
		System.out.println("Full Name: " + myOlaRide.getFullName());
		System.out.println("Email: " + myOlaRide.getEmail());
		System.out.println("Phone Number: " + myOlaRide.getPhoneNumber());
		System.out.println("Pickup Location: " + myOlaRide.getPickupLocation());
		System.out.println("Drop Location: " + myOlaRide.getDropLocation());
		System.out.println("Ride Type: " + myOlaRide.getRideType());
		System.out.println("Car Model: " + myOlaRide.getCarModel());
		System.out.println("Driver Name: " + myOlaRide.getDriverName());
		System.out.println("Ride Fare: " + myOlaRide.getRideFare());
		System.out.println("Distance Traveled: " + myOlaRide.getDistanceTraveled());
		System.out.println("Rating: " + myOlaRide.getRating());
		System.out.println("Ride Completed: " + myOlaRide.isRideCompleted());
		System.out.println("Payment Done: " + myOlaRide.isPaymentDone());
	}

}
