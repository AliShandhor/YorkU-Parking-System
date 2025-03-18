package com.yorku.parkingsystem.payment;

public class DebitCard implements PaymentStrategy {
	private String name;
	private int cardNumber;
	private int cvv;
	private String dateOfExpiry;
	
	
	public DebitCard(String name, int cardNumber, int cvv, String dateOfExpiry) {
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

	public int getCardNumber() {
		return cardNumber;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	
}
	
	
