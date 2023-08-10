package com.example.name.main;

import com.example.name.YouTube;

public class YoutubeRunner {
	public static void main(String[] args) {
		
		YouTube you = new YouTube();
		
		you.setChannelName("tech news");
		you.setOwnerName("Prasad");
		you.setVerified(true);
		you.setViedouploaded("on iphone 13");
		you.setDescription("unboxing of the mobile");
		you.setEmail("prasad@gamil.com");
		you.setCountry("India");
		you.setProfilePicture("Shrii");
		you.setSubscribersCount(3330000);
		you.setVideosCount(68);
		you.setViewsCount(32344);
		you.setLikesCount(122222);
		you.setJoinDate("12/3/2019");
		you.setLastActivity("3 days ago");
		
		System.out.println("Channel Name = "+you.getChannelName());
		System.out.println("Owner name = "+you.getOwnerName());
		System.out.println("Verified = "+you.Verified());
		System.out.println("Viedouploaded = "+you.getViedouploaded());
		System.out.println("description = "+you.getDescription());
		System.out.println("Email = "+you.getEmail());
		System.out.println("Country = "+you.getCountry());
		System.out.println("profile Picture = "+you.getProfilePicture());
		System.out.println("Subscribers Count = "+you.getSubscribersCount());
		System.out.println("videosCount = "+you.getVideosCount());
		System.out.println("viewsCount = "+you.getViewsCount());
		System.out.println("likesCount = "+you.getLikesCount());
		System.out.println("joinDate = "+you.getJoinDate());
		System.out.println("Last Activity = "+you.getLastActivity());
	}

}
