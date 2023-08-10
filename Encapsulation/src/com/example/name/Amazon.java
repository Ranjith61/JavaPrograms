package com.example.name;

public class Amazon {
	
	private String accountName;
	private String email;
	private String shippingAddress;
	private int cartItemCount;
	private int cashbackamount;
	private String paymentMethod;
	private double accountBalance;
	private boolean Verified;
	private boolean Subscribed;
	private String lastLogin;
	private String orderHistory;
	private String wishlist;
	private String primeMembership;
	private int giftCardBalance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public int getCartItemCount() {
		return cartItemCount;
	}
	public void setCartItemCount(int cartItemCount) {
		this.cartItemCount = cartItemCount;
	}
	
	public int getCashbackamount() {
		return cashbackamount;
	}
	public void setCashbackamount(int cashbackamount) {
		this.cashbackamount = cashbackamount;
	}
	  
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public boolean isVerified() {
		return Verified;
	}
	public void setVerified(boolean verified) {
		Verified = verified;
	}
	
	public boolean isSubscribed() {
		return Subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		Subscribed = subscribed;
	}
	
	public String getLastLogin() {
		return lastLogin;
	}	
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public String getOrderHistory() {
		return orderHistory;
	}	
	public void setOrderHistory(String orderHistory) {
		this.orderHistory = orderHistory;
	}
	
	public String getWishlist() {
		return wishlist;
	}	
	public void setWishlist(String wishlist) {
		this.wishlist = wishlist;
	}
	
	public String getPrimeMembership() {
		return primeMembership;
	}	
	public void setPrimeMembership(String primeMembership) {
		this.primeMembership = primeMembership;
	}
	
	public int getGiftCardBalance() {
		return giftCardBalance;
	}
	public void setGiftCardBalance(int giftCardBalance) {
		this.giftCardBalance = giftCardBalance;
	}
	
	
	
}
