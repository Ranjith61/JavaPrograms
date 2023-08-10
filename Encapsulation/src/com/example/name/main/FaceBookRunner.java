package com.example.name.main;

import com.example.name.FaceBook;

public class FaceBookRunner {
	public static void main(String[] args) {
		
		FaceBook face = new FaceBook();
		face.setUserName("Ranjith Reddy");
		face.setFullName("Ranjith Kumar");
		face.setRelationshipStatus("Friend");
		face.setBio("Life is too short enjoy every second");
		face.setEmail("reddy@gamil.com");
		face.setLocation("Banglore");
		face.setProfilePicture("Ranji");
		face.setFriendsCount(211);
		face.setFollowersCount(255);
		face.setPostsCount(566);
		face.setLikesCount(423);
		face.setVerified(false);
		face.setPrivate(false);
		face.setLastActive("3 hours ago");
		
		System.out.println("User Name = "+face.getUserName());
		System.out.println("Full Name = "+face.getFullName());
		System.out.println("Relationship Status = "+face.getRelationshipStatus());
		System.out.println("Bio = "+face.getBio());
		System.out.println("Email = "+face.getEmail());
		System.out.println("Loaction = "+face.getLocation());
		System.out.println("Profie Picture = "+face.getProfilePicture());
		System.out.println("Friends Count = "+face.getFriendsCount());
		System.out.println("Followers Count = "+face.getFollowersCount());
		System.out.println("Posts Count = "+face.getPostsCount());
		System.out.println("Likes Count = "+face.getLikesCount());
		System.out.println("Verified = "+face.isVerified());
		System.out.println("Private = "+face.isPrivate());
		System.out.println("Last Active = "+face.getLastActive());
				
	}

}
