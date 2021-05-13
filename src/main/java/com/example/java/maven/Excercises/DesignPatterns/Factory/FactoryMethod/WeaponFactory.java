package com.example.java.maven.Excercises.DesignPatterns.Factory.FactoryMethod;

public class WeaponFactory {

    public Weapon createWeapon(String weaponType) {
        if (weaponType == null || weaponType.length() < 1) {
            throw new IllegalArgumentException("Weapon type can not be null or empty");
        }
        else if (weaponType.equalsIgnoreCase("Sword")) {
            return new Sword();
        }
        else if (weaponType.equalsIgnoreCase("Axe")) {
            return new Axe();
        }
        else {
            throw new IllegalArgumentException("This type of weapon was not invented yet");
        }
    }
}
