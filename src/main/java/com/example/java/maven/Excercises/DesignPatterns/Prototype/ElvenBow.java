package com.example.java.maven.Excercises.DesignPatterns.Prototype;

public class ElvenBow implements Prototype{
    private final String bowType;
    private final int range;
    private final int damage;

    public ElvenBow(int range, int damage) {
        this.bowType = "Elven bow";
        this.range = range;
        this.damage = damage;
    }

    public String getBowType() {
        return bowType;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public ElvenBow(ElvenBow sourceObject) {
        this.bowType = sourceObject.bowType;
        this.range = sourceObject.range;
        this.damage = sourceObject.damage;
    }

    @Override
    public ElvenBow copy() {
        return new ElvenBow(this);
    }

    @Override
    public String toString() {
        return "ElvenBow{" +
                "range=" + range +
                ", damage=" + damage +
                '}';
    }
}
