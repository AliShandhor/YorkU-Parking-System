package com.yorku.parkingsystem.payment;

public class MobilePayment implements PaymentStrategy{
    private String phoneNo;
    private String mobileMethod;

    public MobilePayment(String phoneNo, String mobileMethod) {
        this.phoneNo = phoneNo;
        this.mobileMethod = mobileMethod;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with mobile payment");


    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getMobileMethod() {
        return mobileMethod;
    }
}
