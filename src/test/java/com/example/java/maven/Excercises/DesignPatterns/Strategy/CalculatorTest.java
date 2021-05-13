package com.example.java.maven.Excercises.DesignPatterns.Strategy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @ParameterizedTest(name = "{index} => number1={0}, number2={1}, expectedResult={2}")
    @CsvSource({
            "1, 1, 2",
            "5, 10, 15",
            "101, 99, 200"
    })
    void shouldExecuteAddition(int number1, int number2, int expectedResult) {
        //given
        Calculator calculator = new Calculator(new Addition());

        //when
        int result = calculator.calculate(number1, number2);

        //then
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest(name = "{index} => number1={0}, number2={1}, expectedResult={2}")
    @CsvSource({
            "1, 1, 0",
            "5, 10, -5",
            "101, 99, 2"
    })
    void shouldExecuteSubtraction(int number1, int number2, int expectedResult) {
        //given
        Calculator calculator = new Calculator(new Subtraction());

        //when
        int result = calculator.calculate(number1, number2);

        //then
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest(name = "{index} => number1={0}, number2={1}, expectedResult={2}")
    @CsvSource({
            "1, 1, 1",
            "5, 10, 50",
            "101, 99, 9999"
    })
    void shouldExecuteMultiplication(int number1, int number2, int expectedResult) {
        //given
        Calculator calculator = new Calculator(new Multiplication());

        //when
        int result = calculator.calculate(number1, number2);

        //then
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest(name = "{index} => number1={0}, number2={1}, expectedResult={2}")
    @CsvSource({
            "7, 5, 2",
            "15, 10, 5",
            "30, 20, 10"
    })
    void shouldExecuteModuloOperation(int number1, int number2, int expectedResult) {
        //given
        Calculator calculator = new Calculator(new ModuloOperation());

        //when
        int result = calculator.calculate(number1, number2);

        //then
        assertEquals(result, expectedResult);
    }
}
