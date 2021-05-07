package com.example.java.maven.Excercises.MobileKeyboardConverter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class MobileKeyboardConverterTest {

    MobileKeyboardConverter converter = new MobileKeyboardConverter();

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
    void shouldConvertLetterToProperNumber(String toConvert, long expectedNumber) {
        Assertions.assertThat(converter.convertTextToNumbers(toConvert)).isEqualTo(expectedNumber);
    }

    @ParameterizedTest(name = "{index} => providedText{0}, expectedNum={1}")
    @CsvSource({
            "BUT, 22888",
            "BU T, 228818",
            "kitku, 5544485588",

    })
    void shouldConvertWordToProperNumber(String toConvert, long expectedNumber) {
        Assertions.assertThat(converter.convertTextToNumbers(toConvert)).isEqualTo(expectedNumber);
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
    void shouldConvertNumberToProperLetter(long toConvert, String expectedString) {
        Assertions.assertThat(converter.convertNumbersToText(toConvert)).isEqualTo(expectedString);
    }

    @ParameterizedTest(name = "{index} => providedNum={0}, expectedText={1}")
    @CsvSource({
            "2208808, BUT",
            "220108808, B UT",
            "55044408055088, KITKU"
    })
    void shouldConvertNumberToProperWord(long providedNum, String expectedText) {
        Assertions.assertThat(converter.convertNumbersToText(providedNum)).isEqualTo(expectedText);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowExceptionIfProvidedStringIsEmptyOrNull(String providedString) {
        assertThrows(IllegalArgumentException.class, () -> converter.convertTextToNumbers(providedString));
    }

    @ParameterizedTest
    @ValueSource(longs = {-1, -10})
    void shouldThrowExceptionIfProvidedNumberIsSmallerThanTwo(long providedNumber) {
        assertThrows(IllegalArgumentException.class, () -> converter.convertNumbersToText(providedNumber));
    }
}


