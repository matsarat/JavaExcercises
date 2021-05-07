package com.example.java.maven.Excercises.MobileKeyboardConverter;

public class MobileKeyboardConverter {

    public long convertTextToNumbers(String toConvert) {
        if (toConvert == null || toConvert.equals("")) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        int toConvertLen = toConvert.length();
        String upperCaseToConvert = toConvert.toUpperCase();
        StringBuilder textConvertedToNumbers = new StringBuilder();

        for (int index = 0; index < toConvertLen; index++) {
            textConvertedToNumbers.append(Letter.matchNumberToLetter(upperCaseToConvert.charAt(index)));
        }
        return Long.parseLong(textConvertedToNumbers.toString());
    }

    public String convertNumbersToText(long toConvert) {
        if (toConvert < 0) {
            throw new IllegalArgumentException("Input cannot be smaller than 0");
        }

        String stringToConvert = String.valueOf(toConvert);
        String[] numeralRepresentationsOfChars = stringToConvert.split("0");
        StringBuilder numbersConvertedToText = new StringBuilder();

        for (String numRepOfChar : numeralRepresentationsOfChars) {
            numbersConvertedToText.append(Letter.matchLetterToNumber(numRepOfChar));
        }
        return numbersConvertedToText.toString();
    }
}
