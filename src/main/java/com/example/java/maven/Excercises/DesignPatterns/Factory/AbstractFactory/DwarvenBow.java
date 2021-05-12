package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

public class DwarvenBow implements Bow{
    private final static String BOW_TYPE = "Elven bow";

    @Override
    public String getBowType() {
        return BOW_TYPE;
    }

    @Override
    public int getRange() {
        return 50;
    }
}
