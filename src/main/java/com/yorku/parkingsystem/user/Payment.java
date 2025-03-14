package com.yorku.parkingsystem.user;

public class Payment {
	private String paymentID;
	private double amount;
	private String paymentMethod;
	private String paymentStatus;
	

	public Payment(String paymentID, double amount, String paymentMethod, String paymentStatus) {
		this.paymentID = paymentID;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
	}
	

	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public String getPaymentID() {
		return paymentID;
	}


	public double getAmount() {
		return amount;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}
}


