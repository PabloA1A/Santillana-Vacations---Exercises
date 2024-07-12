package dev.pablo.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonthCalendarTest {
    private MonthCalendar calendar;

    @BeforeEach
    void setUp() {
        calendar = new MonthCalendar();
    }

    @Test
    void testGetValidMonth() {
        Month month = calendar.getMonth(1);
        assertNotNull(month);
        assertEquals("January", month.getName());
        assertEquals(31, month.getDays());
    }

    @Test
    void testGetInvalidMonth() {
        Month month = calendar.getMonth(13);
        assertNull(month);        
    }

    @Test
    void testAllMonthsCreated() {
        for (int i = 1; i<= 12; i++) {
            assertNotNull(calendar.getMonth(i));
        }
    }

    @Test
    void testFebruaryDays() {
        Month february = calendar.getMonth(2);
        assertEquals(28, february.getDays());
    }

    @Test
    void testDisplayMonthInformation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calendar.displayMonthInformation(4);

        String expectedOutput = "Month: April\nDays: 30\n";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testDisplayInvalidMonthInformation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calendar.displayMonthInformation(13);

        String expectedOutput = "Invalid month number\n";
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}
