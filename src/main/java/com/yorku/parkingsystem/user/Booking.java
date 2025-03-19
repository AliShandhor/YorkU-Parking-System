package com.yorku.parkingsystem.user;

import java.util.Date;

public class Booking {
	private int parkingSpotID;
	private int bookingID;
	private User user;
	private Date bookingTime;
	private int duration;
	private boolean noshow;
	private boolean checkin;
	
	public Booking(int parkingSpotID, int bookingID, User user, Date bookingTime, int duration) {
		this.parkingSpotID = parkingSpotID;
		this.bookingID = bookingID;
		this.user = user;
		this.bookingTime = bookingTime;
		this.duration = duration;
		this.noshow = false;
		this.checkin = false;
	}
	// user fails to arrive in the first hour of booking period
	public void noshowdetector(){
		Date currentTime = new Date();
		long onehourmillis = 60*60*1000;

		if (!checkin && (currentTime.getTime() - bookingTime.getTime() > onehourmillis)) {
		this.noshow=true;
		System.out.println("deposit will not be refunded");
		
	}
		
		
	}
	/*
	 * user check in
	 */
	public void checkIn() {
        this.checkin = true;
        this.noshow = false; 
        System.out.println("User " + user.getName() + " checked in for Booking ID: " + bookingID);
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
		noshowdetector();
		BillingVisitor billingVisitor = new BillingVisitor();
		user.accept(billingVisitor);
		if (noshow) {
            System.out.println("Booking cancelled and no refund due to no show.");
        } else {
            System.out.println("Booking cancelled and deposit is refunded.");
        }
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
	public boolean isNoshow() {
		return noshow;
	}
	public boolean isCheckin() {
		return checkin;
	}
	
}