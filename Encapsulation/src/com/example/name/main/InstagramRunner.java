package com.example.name.main;

import com.example.name.Instagram;

public class InstagramRunner {
	public static void main(String[] args) {
		
		Instagram insta = new Instagram();
		
		insta.setUserName("viratkohli");
		insta.setFullName("King Kohli");
		insta.setWebsite("www.instagram.com");
		insta.setLastActive("5hours ago");
		insta.setBio("king is always a king");
		insta.setEmail("Virat@gmail.com");
		insta.setPhoneNumber("+91 6524524362");
		insta.setProfilePicture("King");
		insta.setPostsCount(550);
		insta.setFollowersCount(2500000);
		insta.setFollowingCount(300);
		insta.setPrivate(false);
		insta.setVerified(true);
		insta.setSavedPosts(12);
		
		
		System.out.println("User Name = "+insta.getUserName());
		System.out.println("Full Name = "+insta.getFullName());
		System.out.println("Website = "+insta.getWebsite());
		System.out.println("last active = "+insta.getLastActive());
		System.out.println("Bio = "+insta.getBio());
		System.out.println("Email = "+insta.getEmail());
		System.out.println("Phone Number = "+insta.getPhoneNumber());
		System.out.println("Profile Picture = "+insta.getProfilePicture());
		System.out.println("Posts count = "+insta.getPostsCount());
		System.out.println("Followers Count = "+insta.getFollowersCount());
		System.out.println("Following Count = "+insta.getFollowingCount());
		System.out.println("Private = "+insta.isPrivate());
		System.out.println("Verified = "+insta.isVerified());
		System.out.println("Saved Posts = "+insta.getSavedPosts());
		
			
		
	}

}
