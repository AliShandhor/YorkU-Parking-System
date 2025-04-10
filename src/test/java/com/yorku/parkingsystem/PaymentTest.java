package com.yorku.parkingsystem.payment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    private Payment payment;
    private PaymentStrategy creditCard;
    private PaymentStrategy debitCard;
    private PaymentStrategy mobilePayment;

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard("Test Name", 1234567890123456L, 123, "12/25");
        debitCard = new DebitCard("Test Name", 1234567890123456L, 456, "10/24");
        mobilePayment = new MobilePayment("4161234567", "ApplePay");
        // Start with a default strategy
        payment = new Payment(creditCard);
    }

    @Test
    void testCheckoutWithCreditCard() {
        assertDoesNotThrow(() -> payment.checkout(50.0));
    }

    @Test
    void testSetPaymentStrategyToDebit() {
        payment.setPaymentStrategy(debitCard);
        // Now it should pay with debit
        assertDoesNotThrow(() -> payment.checkout(60.0));
    }

    @Test
    void testSetPaymentStrategyToMobile() {
        payment.setPaymentStrategy(mobilePayment);
        // Now it should pay with mobile
        assertDoesNotThrow(() -> payment.checkout(70.0));
    }

    @Test
    void testNullPaymentStrategy() {
        payment.setPaymentStrategy(null);
        // Should print "No payment method is selected."
        assertDoesNotThrow(() -> payment.checkout(100.0));
    }

    @Test
    void testConstructorWithNullStrategy() {
        Payment payment2 = new Payment(null);
        assertDoesNotThrow(() -> payment2.checkout(30.0));
    }

    @Test
    void testMultipleStrategyChanges() {
        payment.setPaymentStrategy(debitCard);
        payment.checkout(10.0);

        payment.setPaymentStrategy(mobilePayment);
        payment.checkout(20.0);

        payment.setPaymentStrategy(creditCard);
        payment.checkout(30.0);

        // No exception => test passed
    }

    @Test
    void testCheckoutZeroAmount() {
        assertDoesNotThrow(() -> payment.checkout(0.0));
    }

    @Test
    void testCheckoutNegativeAmount() {
        assertDoesNotThrow(() -> payment.checkout(-15.0));
    }

    @Test
    void testGetCoverageForSetStrategy() {
        payment.setPaymentStrategy(debitCard);
        assertDoesNotThrow(() -> payment.checkout(200.0));
        payment.setPaymentStrategy(null);
        assertDoesNotThrow(() -> payment.checkout(200.0));
    }

    @Test
    void testNonInitializedPaymentObject() {
        Payment payment2 = new Payment(null);
        payment2.setPaymentStrategy(creditCard);
        assertDoesNotThrow(() -> payment2.checkout(999.99));
    }
}
