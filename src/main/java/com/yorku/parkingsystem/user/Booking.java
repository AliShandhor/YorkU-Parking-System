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

	/**
	 User who is NOT registered cannot use booking system
	 */
	public Booking(ParkingSpot parkingSpot, int bookingID, User user, Date bookingTime, int duration) {
		if (user == null) {
			throw new IllegalArgumentException("User cannot be null");
		}
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
	}
	// user fails to arrive in the first hour of booking period
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
		if (noShow) {
            System.out.println("Booking cancelled and no refund due to no show.");
        } else {
            System.out.println("Booking cancelled and deposit is refunded.");
        }
    }
	/**
	 * Calculate the total cost of the booking based on the number of hours
	 */

	public double calculateCost() {
		if (user == null) {
			throw new IllegalStateException("User is not registered. Cannot calculate cost.");
		}
		double cost = user.getRatePerHour() * duration;
		return cost;
	}
	public void checkout(Payment payment) {
		double amount=calculateCost();
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
		if (user == null) {
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