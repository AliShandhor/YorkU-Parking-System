package com.yorku.parkingsystem.user;

import com.yorku.parkingsystem.parkinglot.parkingspot.ParkingSpot;
import com.yorku.parkingsystem.payment.Payment;

import java.util.Date;

public class Booking {
	private ParkingSpot parkingSpot;
	private int bookingID;
	private User user;
	private Date bookingTime;
	private int duration;
	private boolean noShow;
	private boolean checkin;
	private double depositAmount;

	/**
	 User who is NOT registered cannot use booking system
	 */
	public Booking(ParkingSpot parkingSpot, int bookingID, User user, Date bookingTime, int duration) {
		if (!user.isRegistered()){
			throw new IllegalArgumentException("This user: + " + user + "is not registered, please register first");
			//return;
		}
		this.parkingSpot = parkingSpot;
		this.bookingID = bookingID;
		this.user = user;
		this.bookingTime = bookingTime;
		this.duration = duration;
		this.noShow = false;
		this.checkin = false;
		this.depositAmount = user.getRatePerHour();
	}
	// checks if the user fails to arrive in the first hour of booking period
	public void noShowDetector(){
		Date currentTime = new Date();
		long onehourmillis = 60*60*1000;

		if (!checkin && (currentTime.getTime() - bookingTime.getTime() > onehourmillis)) {
		this.noShow =true;
		System.out.println("deposit will not be refunded");
		}
	}
	/**
	 * user check in
	 */
	public void checkIn() {
        this.checkin = true;
        this.noShow = false;
        System.out.println("User " + user.getName() + " checked in for Booking ID: " + bookingID);
    }
	
	/**
	 * Confirm and cancel booking
	 * Client can edit or cancel booking before the starting time
	 * Client can extend the parking time before expiration
	 */
	
	public void confirm() {
		BillingVisitor billingVisitor = new BillingVisitor(this);
		user.accept(billingVisitor);

		System.out.println("Booking confirmed for: " + user.getName() + " Booking ID: " + bookingID);
	}
	private boolean beforeBookingStartTime(){
		Date currentTime = new Date();
		return bookingTime.after(currentTime);
	}
	//cancels the booking if the client has not checked in and if the booking has not started yet
	public void cancel() {
		if (beforeBookingStartTime() && !checkin) {
			noShowDetector();
			BillingVisitor billingVisitor = new BillingVisitor(this);
			user.accept(billingVisitor);
			if (noShow) {
				System.out.println("Booking cancelled and no refund due to no show.");
			} else {
				System.out.println("Booking cancelled and deposit is refunded.");
			}
		} else {
			System.out.println("Cannot cancel booking.");
		}
	}

	public void extendBooking(int extraHours){
		Date currentTime = new Date();
		// client can extend parking time before the expiration
		long bookingEndTime = bookingTime.getTime() + (duration * 60 * 60 * 1000);
		if (currentTime.before(new Date(bookingEndTime))) {
			this.duration += extraHours;
			System.out.println("Booking extended by " + extraHours + " hours to " + duration + " hours.");
			// calculate the new cost after extending
			double newTotalCost = calculateCost();
			System.out.println("New total cost: " + newTotalCost);
		} else {
			System.out.println("Cannot extend booking. The booking time has expired.");
		}
	}


	/**
	 * Calculate the total cost of the booking based on the number of hours
	 */

	public double calculateCost() {
		if (!user.isRegistered()) {
			throw new IllegalStateException("User is not registered. Cannot calculate cost.");
		}
		double cost = user.getRatePerHour() * duration;
		return cost;
	}
	public void checkout(Payment payment) {
		double amount=calculateCost();
		// Deduct the deposit amount if the client has checked in
		//user is checked in and not a no show then the final amount to pay will be the base cost deducted with the deposit
		if (checkin && !noShow) {
			amount -= depositAmount;
			System.out.println("Deposit of " + depositAmount + "$ has been deducted from the total cost.");
		}
		payment.checkout(amount);
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
		return noShow;
	}
	public boolean isCheckin() {
		return checkin;
	}


	public void showDetails(){
		if (!user.isRegistered()) {
			System.out.println("User details are unavailable. User is not registered.");
			return;
		}
		System.out.println("Booking Details:" +
				"\nBooking ID: " + bookingID +
				"\nParking Spot Details: "+ parkingSpot +
				"\nUser info: " + user +
				"\nBooking Time: " + bookingTime +
				"\nDuration: " + duration + " hours" +
				"\nTotal Cost: " + calculateCost() + "$"+
				"\nNo Show: " + noShow +
				"\nCheck In: " + checkin);
	}
}