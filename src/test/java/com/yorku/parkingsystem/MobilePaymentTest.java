package com.yorku.parkingsystem.payment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MobilePaymentTest {

    private MobilePayment mobilePayment;

    @BeforeEach
    void setUp() {
        mobilePayment = new MobilePayment("4161234567", "ApplePay");
    }

    @Test
    void testGetPhoneNo() {
        assertEquals("4161234567", mobilePayment.getPhoneNo());
    }

    @Test
    void testGetMobileMethod() {
        assertEquals("ApplePay", mobilePayment.getMobileMethod());
    }

    @Test
    void testPayMethod() {
        assertDoesNotThrow(() -> mobilePayment.pay(25.5));
    }

    @Test
    void testPayZeroAmount() {
        assertDoesNotThrow(() -> mobilePayment.pay(0.0));
    }

    @Test
    void testPayNegativeAmount() {
        assertDoesNotThrow(() -> mobilePayment.pay(-5.0));
    }

    @Test
    void testConstructorDifferentParams() {
        MobilePayment mp = new MobilePayment("6470001111", "GooglePay");
        assertAll(
            () -> assertEquals("6470001111", mp.getPhoneNo()),
            () -> assertEquals("GooglePay", mp.getMobileMethod())
        );
    }

    @Test
    void testEmptyPhoneNumber() {
        MobilePayment mp = new MobilePayment("", "PayPal");
        assertEquals("", mp.getPhoneNo());
    }

    @Test
    void testNullPhoneNumber() {
        // Not typical, but to see if your class or coverage checks for null
        MobilePayment mp = new MobilePayment(null, "SamsungPay");
        assertNull(mp.getPhoneNo());
    }

    @Test
    void testEmptyMobileMethod() {
        MobilePayment mp = new MobilePayment("4169876543", "");
        assertEquals("", mp.getMobileMethod());
    }

    @Test
    void testNullMobileMethod() {
        MobilePayment mp = new MobilePayment("4169876543", null);
        assertNull(mp.getMobileMethod());
    }
}
