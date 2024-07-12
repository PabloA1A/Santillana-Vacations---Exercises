package dev.pablo.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonthTest {

    @Test
    void testMonthCreation() {
        Month month = new Month(1, "January", 31);
        assertEquals(1, month.getNumber());
        assertEquals("January", month.getName());
        assertEquals(31, month.getDays());
    }

    @Test
    void testGetNumber() {
       Month month = new Month(2, "February", 28);
       assertEquals(2, month.getNumber()); 
    }

    @Test
    void testGetName() {
        Month month = new Month(3, "March", 31);
        assertEquals("March", month.getName());
    }

    @Test
    void testGetDays() {
        Month month = new Month(4, "April", 30);
        assertEquals(30, month.getDays());
    }
}
