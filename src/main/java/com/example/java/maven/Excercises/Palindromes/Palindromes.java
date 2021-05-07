package com.example.java.maven.Excercises.Palindromes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindromes {

    String[] array;
    List<String> results = new ArrayList<>();


    public String returnResults() {
        return "Results: " + results.toString()
                .replace(",", "");
    }

    public static void main(String[] args) {
        Palindromes palindromes = new Palindromes();
        palindromes.getUserInput();
        palindromes.determineIfProvidedStringsArePalindromes();
        System.out.println(palindromes.returnResults());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of strings and strings to check");
        this.array = new String[Integer.parseInt(scanner.nextLine())];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextLine();
        }
    }

    String returnAlphabetical(String string) {
        return Arrays.stream(string.split(""))
                .filter(s -> Character.isAlphabetic(s.charAt(0)))
                .collect(Collectors.joining());
    }

    String reverseString(String stringToReverse) {
        String reversedString = "";
        for (int index = stringToReverse.length() - 1; index >= 0; index--) {
            reversedString += stringToReverse.charAt(index);
        }
        return reversedString;
    }

    String checkIfStringIsPalindrome(String stringToCheck) {
        if (returnAlphabetical(stringToCheck).equalsIgnoreCase(returnAlphabetical(reverseString(stringToCheck)))) {
            return "Y";
        } else {
            return "N";
        }
    }

    void determineIfProvidedStringsArePalindromes() {
        results = Arrays.stream(array)
                .map(this::checkIfStringIsPalindrome)
                .collect(Collectors.toList());
    }
}
