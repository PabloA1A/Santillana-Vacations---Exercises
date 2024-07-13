package dev.pablo.exercise2;

public class ElementsFinder {
    public static void main(String[] args) {
        CommonElementsFinder finder = new CommonElementsFinder();
        int[] array1 = { 1, 2, 3, 4, 4, 5, 2 };
        int[] array2 = { 2, 3, 4, 6, 7 };
        finder.setArrays(array1, array2);
        finder.printCommonElements();
    }
}