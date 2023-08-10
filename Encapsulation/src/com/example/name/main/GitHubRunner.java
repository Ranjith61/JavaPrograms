package com.example.name.main;

import com.example.name.GitHub;

public class GitHubRunner {
	public static void main(String[] args) {
		
		GitHub git = new GitHub();
		git.setUserName("Ranjith61");
		git.setBio("The list of java programs");
		git.setEmail("ranjithkumar.xworkz@gmail.com");
		git.setRepositoriesCount(4);
		git.setFollowersCount(215);
		git.setLocation("Banglore");
		git.setVerified(false);
		git.setWebsite("mywebsite.com");
		git.setLastActive("23hours ago");
		git.setProfilePicture("Git");
		git.setFullName("Ranjith Kumar");
		git.setFollowingCount(224);
		git.setStarsReceived(5);
		git.setPrivate(true);
		
		System.out.println("User Name : "+git.getUserName());
		System.out.println("Bio : "+git.getBio());
		System.out.println("Email : "+git.getEmail());
		System.out.println("Repository count : "+git.getRepositoriesCount());
		System.out.println("Followers count : "+git.getFollowersCount());
		System.out.println("Location : "+git.getLocation());
		System.out.println("Is verified : "+git.isVerified());
		System.out.println("Website : "+git.getWebsite());
		System.out.println("Last active : "+git.getLastActive());
		System.out.println("Profile Picture : "+git.getProfilePicture());
		System.out.println("Full Name : "+git.getFullName());
		System.out.println("Following Count : "+git.getFollowingCount());
		System.out.println("Stars Received : "+git.getStarsReceived());
		System.out.println("Is private : "+git.isPrivate());
		
		
		
		
		
	}

}
