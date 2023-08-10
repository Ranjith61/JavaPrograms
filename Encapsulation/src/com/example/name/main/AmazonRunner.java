package com.example.name.main;

import com.example.name.Amazon;

public class AmazonRunner {
	public static void main(String[] args) {
		
		Amazon cart = new Amazon();
		cart.setAccountName("Reddy");
		cart.setEmail("ranjithreddy2002@gmail.com");
		cart.setShippingAddress("Srinivaspur");
		cart.setCartItemCount(3);
		cart.setCashbackamount(300);
		cart.setPaymentMethod("Google pay");
		cart.setAccountBalance(3200);
		cart.setVerified(false);
		cart.setSubscribed(false);
		cart.setLastLogin("2days ago");
		cart.setOrderHistory("25 items");
		cart.setWishlist("Iphone");
		cart.setPrimeMembership("12 months");
		cart.setGiftCardBalance(2000);
		
		System.out.println("Account name = "+cart.getAccountName());
		System.out.println("Email = "+cart.getEmail());
		System.out.println("Shipping Address = "+cart.getShippingAddress());
		System.out.println("Cart Itemcount = "+cart.getCartItemCount());
		System.out.println("cashback amount = "+cart.getCashbackamount());
		System.out.println("Payment Method = "+cart.getPaymentMethod());
		System.out.println("Account balance = "+cart.getAccountBalance());
		System.out.println("Verified = "+cart.isVerified());
		System.out.println("Subscribed = "+cart.isSubscribed());
		System.out.println("Lastlogin = "+cart.getLastLogin());
		System.out.println("Order History = "+cart.getOrderHistory());
		System.out.println("wishlist = "+cart.getWishlist());
		System.out.println("Prime membership = "+cart.getPrimeMembership());
		System.out.println("Giftcard balance = "+cart.getGiftCardBalance());
		
	
	
	
	
	
	
	}

}
