package com.yorku.parkingsystem.payment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DebitCardTest {

    private DebitCard debitCard;

    @BeforeEach
    void setUp() {
        debitCard = new DebitCard("Alice", 1111222233334444L, 321, "11/24");
    }

    @Test
    void testGetName() {
        assertEquals("Alice", debitCard.getName());
    }

    @Test
    void testGetCardNumber() {
        assertEquals(1111222233334444L, debitCard.getCardNumber());
    }

    @Test
    void testGetCvv() {
        assertEquals(321, debitCard.getCvv());
    }

    @Test
    void testGetDateOfExpiry() {
        assertEquals("11/24", debitCard.getDateOfExpiry());
    }

    @Test
    void testPayMethod() {
        assertDoesNotThrow(() -> debitCard.pay(100.0));
    }

    @Test
    void testPayZeroAmount() {
        assertDoesNotThrow(() -> debitCard.pay(0.0));
    }

    @Test
    void testPayNegativeAmount() {
        // Check behavior with negative amount
        assertDoesNotThrow(() -> debitCard.pay(-20.0));
    }

    @Test
    void testConstructorDifferentParams() {
        DebitCard dc = new DebitCard("Bob", 9999999999999999L, 999, "05/23");
        assertAll(
            () -> assertEquals("Bob", dc.getName()),
            () -> assertEquals(9999999999999999L, dc.getCardNumber()),
            () -> assertEquals(999, dc.getCvv()),
            () -> assertEquals("05/23", dc.getDateOfExpiry())
        );
    }

    @Test
    void testEdgeCaseCVV() {
        DebitCard dc = new DebitCard("Test", 4444333322221111L, 0, "07/28");
        assertEquals(0, dc.getCvv());
    }

    @Test
    void testEdgeCaseCardNumber() {
        DebitCard dc = new DebitCard("Test2", 5L, 123, "08/29");
        assertEquals(5L, dc.getCardNumber());
    }
}
