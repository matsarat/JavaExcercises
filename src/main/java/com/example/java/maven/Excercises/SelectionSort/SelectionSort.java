package com.example.java.maven.Excercises.SelectionSort;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    int[] array;
    List<Integer> results = new ArrayList<>();


    public String returnResults() {
        return "Results: " + results.toString()
                .replace(",", "");
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.getUserInput();
        selectionSort.sortArray();
        System.out.println(selectionSort.returnResults());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array and numbers to sort");
        this.array = new int[scanner.nextInt()];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextInt();
        }
    }

    int findMaximum(int border) {
        int maximumIndex = 0;
        int maximumValue = 0;
        for (int index = 0; index < border; index++) {
            if (array[index] > maximumValue) {
                maximumIndex = index;
                maximumValue = array[index];
            }
        }
        return maximumIndex;
    }

    void sortArray() {
        int border = array.length;

        for (int index = 0; index < array.length - 1; index++) {
            int currentMaxIndex = findMaximum(border);
            results.add(currentMaxIndex);
            int currentMax = array[currentMaxIndex];
            array[currentMaxIndex] = array[border - 1];
            array[border - 1] = currentMax;
            border--;
        }
    }
}
