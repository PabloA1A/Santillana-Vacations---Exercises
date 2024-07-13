package dev.pablo.exercise3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArmstrongCheckerTest {
    private ArmstrongChecker checker;

    @BeforeEach
    void setUp() {
        checker = new ArmstrongChecker();
    }

    @Test
    void testIsArmstrongForValidArmstrongNumber() {
        checker.setNumber(371);
        assertTrue(checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForNotArmstrongNumber() {
        checker.setNumber(372);
        assertTrue(!checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForZero() {
        checker.setNumber(5);
        assertTrue(checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForNegativeNumber() {
        checker.setNumber(-371);
        assertTrue(!checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForLargeArmstrongNumber() {
        checker.setNumber(9474);
        assertTrue(checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForLargeNonArmstrongNumber() {
        checker.setNumber(9475);
        assertFalse(checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForNumberWithManyDigits() {
        checker.setNumber(153);
        assertTrue(checker.isArmstrong());
    }

    @Test
    void testIsArmstrongForNumberWithManyDigitsNonArmstrong() {
        checker.setNumber(1634);
        assertTrue(checker.isArmstrong());
    }
}