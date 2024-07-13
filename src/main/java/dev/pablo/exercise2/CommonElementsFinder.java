package dev.pablo.exercise2;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsFinder {
    private int[] array1;
    private int[] array2;

    public CommonElementsFinder() {
    }

    public void setArrays(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public Set<Integer> findCommonElement() {
        if (array1 == null || array2 == null) {
            throw new IllegalStateException("Arrays have not been set");
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElement = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                commonElement.add(num);
            }
        }
        return commonElement;
    }

    public void printCommonElements() {
        Set<Integer> commonElements = findCommonElement();
        for (int element : commonElements) {
            System.out.println("Duplicate element: " + element);
        }
    }
}
