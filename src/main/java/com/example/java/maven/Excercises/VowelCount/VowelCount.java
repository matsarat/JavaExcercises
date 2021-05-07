package com.example.java.maven.Excercises.VowelCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelCount {

    String vowels = "aeiouyAEIOUY";
    String[] array;
    List<Integer> results = new ArrayList<>();

    public String returnResults() {
        return "Results: " + results.toString()
                .replace(",", "");
    }

    public static void main(String[] args) {
        VowelCount vowelCount = new VowelCount();
        vowelCount.getUserInput();
        vowelCount.countVowels();
        System.out.println(vowelCount.returnResults());
    }

    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of strings and strings to check");
        this.array = new String[Integer.parseInt(scanner.nextLine())];
        for (int index = 0; index < array.length; index++) {
            this.array[index] = scanner.nextLine();
        }
    }

    void countVowels() {
        for (String string : array) {
            int vowelCount = 0;
            for (int charIndex = 0; charIndex < string.length(); charIndex++) {
                for (int vowelIndex = 0; vowelIndex < vowels.length(); vowelIndex++) {
                    if ((string.charAt(charIndex)) == vowels.charAt(vowelIndex)) {
                        vowelCount++;
                    }
                }
            }
            results.add(vowelCount);
        }
    }
}
