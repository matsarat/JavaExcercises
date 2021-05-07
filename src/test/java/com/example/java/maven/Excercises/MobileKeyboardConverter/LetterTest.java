package com.example.java.maven.Excercises.MobileKeyboardConverter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LetterTest {

    @ParameterizedTest(name = "{index} => providedLetter={0}, expectedNum={1}")
    @CsvSource({
            "'A', 2",
            "'B', 22",
            "'D', 3",
            "'S', 7777",
            "'X', 99",
            "'\0', 0",
            "' ', 1"
    })
    void shouldMatchNumberToLetter(char toMatch, String expectedNumber) {
        Assertions.assertThat(Letter.matchNumberToLetter(toMatch)).isEqualTo(expectedNumber);
    }

    @ParameterizedTest(name = "{index} => providedLetter={0}, expectedNum={1}")
    @ValueSource(chars = {'_', '!', '?'})
    void shouldThrowExceptionIfProvidedCharDoesNotMatchAnyLetter(char toMatch) {
        assertThrows(IllegalArgumentException.class, () -> Letter.matchNumberToLetter(toMatch));
    }

    @ParameterizedTest(name = "{index} => providedNum={0}, expectedLetter={1}")
    @CsvSource({
            "2, A",
            "22, B",
            "3, D",
            "7777, S",
            "99, X",
            "1, ' '"
    })
    void shouldMatchLetterToNumber(String toMatch, char expectedChar) {
        Assertions.assertThat(Letter.matchLetterToNumber(toMatch)).isEqualTo(expectedChar);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowExceptionIfProvidedStringIsEmptyOrNull(String providedString) {
        assertThrows(IllegalArgumentException.class, () -> Letter.matchLetterToNumber(providedString));
    }


    @ParameterizedTest
    @ValueSource(strings = {"-1", "2222", "99999"})
    void shouldThrowExceptionIfProvidedNumberDoesNotMatchAnyLetter(String providedNumber) {
        assertThrows(IllegalArgumentException.class, () -> Letter.matchLetterToNumber(providedNumber));
    }
}
