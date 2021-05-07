package com.example.java.maven.Excercises.SortWithIndexes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortWithIndexes {
    int[] array;
    int[] sortedArray;
    List<Integer> results = new ArrayList<>();

    @Override
    public String toString() {
        return "Sorted array: " + Arrays.toString(sortedArray)
                + " results: " + results.toString().replace(",", "");
    }

    public int[] getArrayCopy() {
        return Arrays.copyOf(array, array.length);
    }

    public static void main(String[] args) {
        SortWithIndexes sortWithIndexes = new SortWithIndexes();
        sortWithIndexes.getUserInput();
        sortWithIndexes.sortArray();
        sortWithIndexes.searchForPrimaryIndices();
        System.out.println(sortWithIndexes.toString());

    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array and numbers to sort");
        array = new int[scanner.nextInt()];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextInt();
        }
    }

    boolean isArraySorted(int[] arrayToCheck) {
        boolean sorted = false;
        for (int index = 0; index < (arrayToCheck.length - 1); index++) {
            if (arrayToCheck[index] > arrayToCheck[index + 1]) {
                sorted = false;
                break;
            } else {
                sorted = true;
            }
        }
        return sorted;
    }

    void sortArray() {
        sortedArray = getArrayCopy();

        while (!isArraySorted(sortedArray)) {
            for (int index = 0; (index < sortedArray.length - 1); index++) {
                if (sortedArray[index] > sortedArray[index + 1]) {
                    int temp = sortedArray[index];
                    sortedArray[index] = sortedArray[index + 1];
                    sortedArray[index + 1] = temp;
                }
            }
        }
    }

    void searchForPrimaryIndices() {
        for (int sortedIndex = 0; sortedIndex < sortedArray.length; sortedIndex++) {
            for (int index = 0; index < array.length; index++) {
                if (sortedArray[sortedIndex] == array[index]) {
                    results.add(index + 1);
                }
            }
        }
    }
}
