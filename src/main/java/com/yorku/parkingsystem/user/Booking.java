package com.yorku.parkingsystem.user;

import java.util.Date;

public class Booking {
	private int parkingSpotID;
	private int bookingID;
	private User user;
	private Date bookingTime;
	private int duration;
	
	public Booking(int parkingSpotID, int bookingID, User user, Date bookingTime, int duration) {
		this.parkingSpotID = parkingSpotID;
		this.bookingID = bookingID;
		this.user = user;
		this.bookingTime = bookingTime;
		this.duration = duration;
	}
	
	/*
	 * confirm and cancel booking
	 */
	
	public void confirm() {
		BillingVisitor billingVisitor = new BillingVisitor();
		user.accept(billingVisitor);
		
		System.out.println("Booking confirmed for: " + user.getName() + " Booking ID: " + bookingID);
	}
	
	public void cancel() {
		BillingVisitor billingVisitor = new BillingVisitor();
		user.accept(billingVisitor);
		
		System.out.println("Booking cancelled for: " + user.getName() + " Booking ID: " + bookingID);
	}
	
	public int getParkingSpotID() {
		return parkingSpotID;
	}
	
	public int getBookingID() {
		return bookingID;
	}
	
	public User getUser() {
		return user;
	}
	
	public Date getBookingTime() {
		return bookingTime;
	}
	
	public int getDuration() {
		return duration;
	}
}