package com.example.java.maven.Excercises.CheckIfPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckIfPrime {
    int[] array;
    List<String> primes = new ArrayList<>();
    List<String> notPrimes = new ArrayList<>();

    @Override
    public String toString() {
        return "PRIMES: " + primes + System.lineSeparator() +
                "NOT PRIMES" + notPrimes + System.lineSeparator();
    }

    public static void main(String[] args) {
        CheckIfPrime checkIfPrime = new CheckIfPrime();
        checkIfPrime.getUserInput();
        checkIfPrime.separatePrimes();
        System.out.println(checkIfPrime.toString());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array and numbers to check");
        this.array = new int[scanner.nextInt()];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextInt();
        }
    }

    boolean checkIfPrime(Integer number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    void separatePrimes() {
        for (Integer number : array) {
            if (number < 2) {
                notPrimes.add(number.toString());
            } else if (number == 2) {
                primes.add(number.toString());
            } else if (checkIfPrime(number)) {
                primes.add(number.toString());
            } else {
                notPrimes.add(number.toString());
            }
        }
    }
}
