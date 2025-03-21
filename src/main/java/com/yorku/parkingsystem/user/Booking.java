package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.parkingspot.ParkingSpot;

import java.util.Date;

public class Booking {
	private ParkingSpot parkingSpot;
	private int bookingID;
	private User user;
	private Date bookingTime;
	private int duration;
	private boolean noshow;
	private boolean checkin;
	
	public Booking(ParkingSpot parkingSpot, int bookingID, User user, Date bookingTime, int duration) {
		this.parkingSpot = parkingSpot;
		this.bookingID = bookingID;
		this.user = user;
		this.bookingTime = bookingTime;
		this.duration = duration;
		this.noshow = false;
		this.checkin = false;
	}
	// user fails to arrive in the first hour of booking period
	public void noShowDetector(){
		Date currentTime = new Date();
		long onehourmillis = 60*60*1000;

		if (!checkin && (currentTime.getTime() - bookingTime.getTime() > onehourmillis)) {
		this.noshow=true;
		System.out.println("deposit will not be refunded");
		}
	}
	/**
	 * user check in
	 */
	public void checkIn() {
        this.checkin = true;
        this.noshow = false; 
        System.out.println("User " + user.getName() + " checked in for Booking ID: " + bookingID);
    }
	
	/**
	 * confirm and cancel booking
	 */
	
	public void confirm() {
		BillingVisitor billingVisitor = new BillingVisitor(this);
		user.accept(billingVisitor);

		System.out.println("Booking confirmed for: " + user.getName() + " Booking ID: " + bookingID);
	}
	
	public void cancel() {
		noShowDetector();
		BillingVisitor billingVisitor = new BillingVisitor(this);
		user.accept(billingVisitor);
		if (noshow) {
            System.out.println("Booking cancelled and no refund due to no show.");
        } else {
            System.out.println("Booking cancelled and deposit is refunded.");
        }
    }
	/**
	 * Calculate the total cost of the booking based on the number of hours
	 */

	public double calculateCost() {
		double cost = user.getRatePerHour() * duration;
		return cost;
	}


	public ParkingSpot parkingSpot() {
		return parkingSpot;
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
	public boolean isNoShow() {
		return noshow;
	}
	public boolean isCheckin() {
		return checkin;
	}


	public void showDetails(){
		System.out.println("Booking Details:" +
				"\nBooking ID: " + bookingID +
				"\nParking Spot Details: "+ parkingSpot +
				"\nUser info: " + user +
				"\nBooking Time: " + bookingTime +
				"\nDuration: " + duration + " hours" +
				"\nTotal Cost: " + calculateCost() + "$"+
				"\nNo Show: " + noshow +
				"\nCheck In: " + checkin);
	}
}