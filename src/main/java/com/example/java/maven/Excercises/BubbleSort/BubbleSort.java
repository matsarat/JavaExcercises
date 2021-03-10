package com.example.java.maven.Excercises.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    int[] array;
    int passesCount = 0;
    int swapsCount = 0;

    @Override
    public String toString() {
        return "Sorted array: " + Arrays.toString(array)
                + ", results: " + passesCount + " " + swapsCount;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.getUserInput();
        bubbleSort.sortArray();
        System.out.println(bubbleSort.toString());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array and numbers to sort");
        this.array = new int[scanner.nextInt()];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextInt();
        }
    }

    boolean isArraySorted() {
        boolean sorted = false;
        passesCount++;
        for (int index = 0; index < (array.length - 1); index++) {
            if (array[index] > array[index + 1]) {
                sorted = false;
                break;
            } else {
                sorted = true;
            }
        }
        return sorted;
    }

    void sortArray() {
        while (!isArraySorted()) {
            for (int index = 0; (index < array.length - 1); index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    swapsCount++;
                }
            }
        }
    }
}
