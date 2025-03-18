package com.yorku.parkingsystem.payment;
//context class
public class Payment {
    private PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount); //selected strategy
        } else {
            System.out.println("No payment method is selected.");
        }
    }
}
