package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

public class DwarvenWeaponFactory implements WeaponAbstractFactory {

    @Override
    public Axe createAxe() {
        return new DwarvenAxe();
    }

    @Override
    public Bow createBow() {
        return new DwarvenBow();
    }
}
