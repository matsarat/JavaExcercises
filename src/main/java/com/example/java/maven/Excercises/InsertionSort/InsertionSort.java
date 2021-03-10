package com.example.java.maven.Excercises.InsertionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    int[] array;
    List<Integer> results = new ArrayList<>();


    public String returnResults() {
        return "Results: " + results.toString()
                .replace(",", "");
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.getUserInput();
        insertionSort.sortArray();
        System.out.println(insertionSort.returnResults());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array and numbers to sort");
        this.array = new int[scanner.nextInt()];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextInt();
        }
    }

    void sortArray() {
        for (int index = 0; index < array.length - 1; index++) {
            int border = index + 1;
            int temp = array[border];
            int swapsCount = 0;
            for (int i = border; i >= 0; i--) {
                if (temp < array[i]) {
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swapsCount++;
                }
            }
            results.add(swapsCount);
        }
    }
}
