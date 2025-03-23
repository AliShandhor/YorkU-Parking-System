package com.yorku.parkingsystem.payment;

public class CreditCard implements PaymentStrategy {
	private String name;
	private long cardNumber;
	private int cvv;
	private String dateOfExpiry;
	
	
	public CreditCard(String name, long cardNumber, int cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid with credit card");
		
	}

	public String getName() {
		return name;
	}

	public long getCardNumber() {
		return cardNumber;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	
}
	
	