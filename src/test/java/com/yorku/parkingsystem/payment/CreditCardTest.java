package com.yorku.parkingsystem.payment;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private CreditCard creditCard;

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard("John Doe", 1234567890123456L, 123, "12/25");
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", creditCard.getName());
    }

    @Test
    void testGetCardNumber() {
        assertEquals(1234567890123456L, creditCard.getCardNumber());
    }

    @Test
    void testGetCvv() {
        assertEquals(123, creditCard.getCvv());
    }

    @Test
    void testGetDateOfExpiry() {
        assertEquals("12/25", creditCard.getDateOfExpiry());
    }

    @Test
    void testPayMethod() {
        // Just verifying there's no exception thrown and the print statement 
        // (In real scenario, might mock or check console output or log.)
        assertDoesNotThrow(() -> creditCard.pay(50.0));
    }

    @Test
    void testPayZeroAmount() {
        assertDoesNotThrow(() -> creditCard.pay(0.0));
    }

    @Test
    void testPayNegativeAmount() {
        // Possibly an odd scenario, but you might want to see how it’s handled
        assertDoesNotThrow(() -> creditCard.pay(-10.0));
    }

    @Test
    void testConstructorWithDifferentParams() {
        CreditCard cc = new CreditCard("Jane Roe", 9876543210987654L, 999, "01/30");
        assertAll(
            () -> assertEquals("Jane Roe", cc.getName()),
            () -> assertEquals(9876543210987654L, cc.getCardNumber()),
            () -> assertEquals(999, cc.getCvv()),
            () -> assertEquals("01/30", cc.getDateOfExpiry())
        );
    }

    @Test
    void testEdgeCaseForCVV() {
        CreditCard cc = new CreditCard("Test", 1111222233334444L, 0, "01/30");
        assertEquals(0, cc.getCvv());
    }

    @Test
    void testEdgeCaseForCardNumber() {
        // Very short or very long - to see if it handles unexpected numbers
        CreditCard cc = new CreditCard("Test2", 1L, 123, "01/30");
        assertEquals(1L, cc.getCardNumber());
    }
}
