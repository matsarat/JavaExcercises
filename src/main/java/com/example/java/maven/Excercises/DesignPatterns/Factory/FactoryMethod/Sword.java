package com.example.java.maven.Excercises.DesignPatterns.Factory.FactoryMethod;

public class Sword implements Weapon {

    private static final String WEAPON_TYPE = "Sword";
    int damage = 50;


    @Override
    public String getWeaponType() {
        return WEAPON_TYPE;
    }

    @Override
    public int getDealtDamage() {
        return damage;
    }
}
