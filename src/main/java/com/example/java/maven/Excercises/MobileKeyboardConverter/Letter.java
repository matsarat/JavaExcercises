package com.example.java.maven.Excercises.MobileKeyboardConverter;

import java.util.Arrays;

public enum Letter {

    A('A', "2"),
    B('B', "22"),
    C('C', "222"),
    D('D', "3"),
    E('E', "33"),
    F('F', "333"),
    G('G', "4"),
    H('H', "44"),
    I('I', "444"),
    J('J', "5"),
    K('K', "55"),
    L('L', "555"),
    M('M', "6"),
    N('N', "66"),
    O('O', "666"),
    P('P', "7"),
    Q('Q', "77"),
    R('R', "777"),
    S('S', "7777"),
    T('T', "8"),
    U('U', "88"),
    V('V', "888"),
    W('W', "9"),
    X('X', "99"),
    Y('Y', "999"),
    Z('Z', "9999"),
    SPACE(' ', "1"),
    CHARSEPARATOR('\0', "0");


    private final char character;
    private final String number;

    Letter(char character, String number) {
        this.character = character;
        this.number = number;
    }

    public static char matchLetterToNumber(String numberToCheck) {

        return Arrays.stream(Letter.values())
                .filter(letter -> letter.number.equals(numberToCheck))
                .map(letter -> letter.character)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Invalid number: %s", numberToCheck)));
    }

    public static String matchNumberToLetter(char letterToCheck) {

        return Arrays.stream(Letter.values())
                .filter(letter -> letter.character == letterToCheck)
                .map(letter -> letter.number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Invalid letter: %s", letterToCheck)));
    }
}
