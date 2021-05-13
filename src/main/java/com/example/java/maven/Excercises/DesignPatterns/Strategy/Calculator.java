package com.example.java.maven.Excercises.DesignPatterns.Strategy;

public class Calculator {

    private CalculationStrategy calculationStrategy;

    public Calculator(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public int calculate(int number1, int number2) {
        return calculationStrategy.calculate(number1, number2);
    }
}
