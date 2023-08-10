package com.example.name.main;

import com.example.name.LinkedIn;

public class LinkedinRunner {
	public static void main(String[] args) {
		
	LinkedIn myLinkedInProfile = new LinkedIn();

	myLinkedInProfile.setUserName("Ranjith");
	myLinkedInProfile.setFullName("Ranjith Kumar");
	myLinkedInProfile.setHeadline("Seeing for the jobs");
	myLinkedInProfile.setEmail("ranjithkumar@gmail.com");
	myLinkedInProfile.setLocation("Bangalore");
	myLinkedInProfile.setProfilePicture("profile.jpg");
	myLinkedInProfile.setConnectionsCount(50);
	myLinkedInProfile.setPostsCount(5);
	myLinkedInProfile.setFollowersCount(100);
	myLinkedInProfile.setEndorsementsCount(50);
	myLinkedInProfile.setPremium(true);
	myLinkedInProfile.setVerified(true);
	myLinkedInProfile.setCurrentJob("Software Engineer at TechCompany");
	myLinkedInProfile.setLastActivity("2023-07-20 5:30");

	System.out.println("User Name: " + myLinkedInProfile.getUserName());
	System.out.println("Full Name: " + myLinkedInProfile.getFullName());
	System.out.println("Headline: " + myLinkedInProfile.getHeadline());
	System.out.println("Email: " + myLinkedInProfile.getEmail());
	System.out.println("Location: " + myLinkedInProfile.getLocation());
	System.out.println("Profile Picture: " + myLinkedInProfile.getProfilePicture());
	System.out.println("Connections Count: " + myLinkedInProfile.getConnectionsCount());
	System.out.println("Posts Count: " + myLinkedInProfile.getPostsCount());
	System.out.println("Followers Count: " + myLinkedInProfile.getFollowersCount());
	System.out.println("Endorsements Count: " + myLinkedInProfile.getEndorsementsCount());
	System.out.println("Premium: " + myLinkedInProfile.isPremium());
	System.out.println("Verified: " + myLinkedInProfile.isVerified());
	System.out.println("Current Job: " + myLinkedInProfile.getCurrentJob());
	System.out.println("Last Activity: " + myLinkedInProfile.getLastActivity());
	
	}

}


