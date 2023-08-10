package com.example.name.main;

import com.example.name.Whatsapp;

public class WhatsappRunner {

	public static void main(String[] args) {
		Whatsapp what=new Whatsapp();
		what.setSize("56 MB");
		what.setSendMessage(true);
		what.setUserName("Ranjith Reddy");
		what.setPhoneNumber("+91 8088076553");
		what.setProfilePicture("NTR");
		what.setStatus("selectd contacts");
		what.setLastSeen("Every one");
		what.setMessageNotifications(false);
		what.setGroupNotifications(true);
		what.setDarkMode(true);
		what.setMediaShared(233);
		what.setTotalContacts(155);
		what.setColour("Green");
		what.setBlockedContacts(10);
		
		
		System.out.println("Size : "+what.getSize());
		System.out.println("SendMessage :"+what.isSendMessage());
		System.out.println("UserName : "+what.getUserName());
		System.out.println("PhoneNumber : "+what.getPhoneNumber());
		System.out.println("ProfilePicture : "+what.getProfilePicture());
		System.out.println("Status : "+what.getStatus());
		System.out.println("LastSeen : "+what.getLastSeen());
		System.out.println("Message Notifications : "+what.isMessageNotifications());
		System.out.println("Group Notifications : "+what.isGroupNotifications());
		System.out.println("Dark Mode : "+what.isDarkMode());
		System.out.println("Media Shared : "+what.getMediaShared());
		System.out.println("Total Contacts : "+what.getTotalContacts());
		System.out.println("colour : "+what.getColour());
		System.out.println("Blocked Contacts : "+what.getBlockedContacts());
		
	
	
	}

}
