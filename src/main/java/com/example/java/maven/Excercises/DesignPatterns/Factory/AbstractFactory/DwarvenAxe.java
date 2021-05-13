package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

public class DwarvenAxe implements Axe{
    private final static String AXE_TYPE = "Dwarven axe";

    @Override
    public String getAxeType() {
        return AXE_TYPE;
    }

    @Override
    public int getDealtDamage() {
        return 100;
    }
}
