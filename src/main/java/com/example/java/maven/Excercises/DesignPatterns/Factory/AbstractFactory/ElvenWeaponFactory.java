package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

public class ElvenWeaponFactory implements WeaponAbstractFactory{

    @Override
    public Axe createAxe() {
        return new ElvenAxe();
    }

    @Override
    public Bow createBow() {
        return new ElvenBow();
    }
}
