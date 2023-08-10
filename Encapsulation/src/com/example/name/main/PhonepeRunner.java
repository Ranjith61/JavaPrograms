package com.example.name.main;

import com.example.name.Phonepe;

public class PhonepeRunner {

	public static void main(String[] args) {
		
	Phonepe phone = new Phonepe();
	phone.setUserName("karan");
	phone.setPhoneNumber("76235643153");
	phone.setEmail("karan@gmail.com");
	phone.setUpiId("76235643153@ybl");
	phone.setLinkedBankAccount("Canara Bank");
	phone.setAddress("Udupi");
	phone.setWalletBalance(3566);
	phone.setTransactionsCount(67672);
	phone.setRewardsPoints(432);
	phone.setKycVerified(true);
	phone.setUpiEnabled(false);
	phone.setLastLogin("2 hours ago");
	phone.setPreferredLanguage("Engish");
	phone.setAppSize("55 MB");
	
	System.out.println("User Name = "+phone.getUserName());
	System.out.println("Phone Number = "+phone.getPhoneNumber());
	System.out.println("Email = "+phone.getEmail());
	System.out.println("UPI Id = "+phone.getUpiId());
	System.out.println("Linked BankAccount = "+phone.getLinkedBankAccount());
	System.out.println("Address = "+phone.getAddress());
	System.out.println("Wallet Balance = "+phone.getWalletBalance());
	System.out.println("Transactions Count = "+phone.getTransactionsCount());
	System.out.println("Rewards Points = "+phone.getRewardsPoints());
	System.out.println("Kyc Verified = "+phone.isKycVerified());
	System.out.println("UPi Enabled = "+phone.isUpiEnabled());
	System.out.println("Last login = "+phone.getLastLogin());
	System.out.println("Preferred Language = "+phone.getPreferredLanguage());
	System.out.println("App Size = "+phone.getAppSize());	
	}

}
