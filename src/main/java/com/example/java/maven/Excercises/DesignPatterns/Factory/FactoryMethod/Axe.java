package com.example.java.maven.Excercises.DesignPatterns.Factory.FactoryMethod;

public class Axe implements Weapon{

    private static String WEAPON_TYPE = "Axe";
    int damage = 100;

    @Override
    public String getWeaponType() {
        return WEAPON_TYPE;
    }

    @Override
    public int getDealtDamage() {
        return damage;
    }
}
