package com.yorku.parkingsystem.user;

import java.util.Date;

public class Booking {
	private String bookingID;
	private ParkingSpace parkingSpace;
	private User user;
	private Date startTime;
	private Date endTime;
	private Payment payment;
	private boolean no_show; 
	
	public Booking(String bookingID, ParkingSpace parkingSpace, User user, Date startTime, Date endTime, Payment payment) {
		this.bookingID = bookingID;
        this.parkingSpace = parkingSpace;
        this.startTime = startTime;
        this.endTime = endTime;
        this.payment = payment;
        this.user = user;
        this.no_show = false;
    
	}
	
	/*
	 * confirm and cancel booking
	 * not refunded if no show
	 */
	
	public void confirm() {
		BillingVisitor billingVisitor = new BillingVisitor();
		user.accept(billingVisitor);
		
		System.out.println("Booking confirmed for: " + user.getName() + bookingID);
	}
	/*
	public void cancel() {
		if (!no_show) {
			 payment.refundPayment(payment.getAmount());
		} else {
			System.out.println("No refund for no-show.");
		}
	}
	*/
	public void setNo_show(boolean no_show) {
		this.no_show = no_show;
	}

	public String getBookingID() {
		return bookingID;
	}

	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public User getUser() {
		return user;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public Payment getPayment() {
		return payment;
	}


	
	

}
