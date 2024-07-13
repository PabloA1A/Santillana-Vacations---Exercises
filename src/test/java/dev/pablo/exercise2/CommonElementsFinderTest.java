package dev.pablo.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommonElementsFinderTest {

    private CommonElementsFinder finder;

    @BeforeEach
    public void setUp() {
        finder = new CommonElementsFinder();
    }

    @Test
    void testFindCommonElement() {
        int[] array1 = { 1, 2, 3, 4, 5, 2 };
        int[] array2 = { 2, 3, 4, 6, 7 };
        finder.setArrays(array1, array2);

        Set<Integer> commonElements = finder.findCommonElement();

        assertEquals(3, commonElements.size());
        assertTrue(commonElements.contains(2));
        assertTrue(commonElements.contains(3));
        assertTrue(commonElements.contains(4));
    }

    @Test
    public void testFindCommonElementsWithoutSettingArrays() {
        assertThrows(IllegalStateException.class, () -> finder.findCommonElement());
    }

    @Test
    public void testFindCommonElementsWithEmptyArrays() {
        int[] array1 = {};
        int[] array2 = {};
        finder.setArrays(array1, array2);

        Set<Integer> commonElement = finder.findCommonElement();

        assertTrue(commonElement.isEmpty());
    }

    @Test
    public void testFindCommonElementsWithNoCommonElements() {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        finder.setArrays(array1, array2);

        Set<Integer> commonElements = finder.findCommonElement();

        assertTrue(commonElements.isEmpty());
    }

    @Test
    public void testPrintCommonElements() {
        int[] array1 = { 1, 2, 3, 4, 5, 2 };
        int[] array2 = { 2, 3, 4, 6, 7 };
        finder.setArrays(array1, array2);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        finder.printCommonElements();

        String expectedOutput = "Duplicate element: 2\nDuplicate element: 3\nDuplicate element: 4\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
