package com.example.java.maven.Excercises.Palindromes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        palindromes.checkIfStringsArePalindromes();
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
        String alphabeticalString = "";
        for (int index = 0; index < string.length(); index++) {
            if (Character.isAlphabetic(string.charAt(index))) {
                alphabeticalString += string.charAt(index);
            }
        }
        return alphabeticalString;
    }

    String reverseString(String stringToReverse) {
        String reversedString = "";
        for (int index = stringToReverse.length() - 1; index >= 0; index--) {
            reversedString += stringToReverse.charAt(index);
        }
        return reversedString;
    }

    void checkIfStringsArePalindromes() {
        for (String stringToCheck : array) {
            if (returnAlphabetical(stringToCheck).equalsIgnoreCase(returnAlphabetical(reverseString(stringToCheck)))) {
                results.add("Y");
            } else {
                results.add("N");
            }
        }
    }
}
