package com.example.name.main;

import com.example.name.Netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Netflix myNetflixAccount = new Netflix();

		myNetflixAccount.setAccountName("Rakshith");
		myNetflixAccount.setEmail("rakshith@gmail.com");
		myNetflixAccount.setSubscriptionPlan("Premium");
		myNetflixAccount.setPaymentMethod("Bank Card");
		myNetflixAccount.setWatchHistory("Show A, Show B, Movie C");
		myNetflixAccount.setWatchlist("Movie D, Show E");
		myNetflixAccount.setRecommendations("Movie X, Show Y");
		myNetflixAccount.setProfilesCount(4);
		myNetflixAccount.setTotalWatchedTime(200);
		myNetflixAccount.setContinueWatchingCount(2);
		myNetflixAccount.setDownloadsCount(10);
		myNetflixAccount.setPremium(true);
		myNetflixAccount.setSubscribed(true);
		myNetflixAccount.setLastLogin("2023-03-11 2:30");

		System.out.println("Account Name: " + myNetflixAccount.getAccountName());
		System.out.println("Email: " + myNetflixAccount.getEmail());
		System.out.println("Subscription Plan: " + myNetflixAccount.getSubscriptionPlan());
		System.out.println("Payment Method: " + myNetflixAccount.getPaymentMethod());
		System.out.println("Watch History: " + myNetflixAccount.getWatchHistory());
		System.out.println("Watchlist: " + myNetflixAccount.getWatchlist());
		System.out.println("Recommendations: " + myNetflixAccount.getRecommendations());
		System.out.println("Profiles Count: " + myNetflixAccount.getProfilesCount());
		System.out.println("Total Watched Time: " + myNetflixAccount.getTotalWatchedTime());
		System.out.println("Continue Watching Count: " + myNetflixAccount.getContinueWatchingCount());
		System.out.println("Downloads Count: " + myNetflixAccount.getDownloadsCount());
		System.out.println("Premium: " + myNetflixAccount.isPremium());
		System.out.println("Subscribed: " + myNetflixAccount.isSubscribed());
		System.out.println("Last Login: " + myNetflixAccount.getLastLogin());
	}

}
	
