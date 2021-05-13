package com.example.java.maven.Excercises.DesignPatterns.Strategy;

public class Addition implements CalculationStrategy{

    @Override
    public int calculate(int number1, int number2) {
        return number1 + number2;
    }
}
