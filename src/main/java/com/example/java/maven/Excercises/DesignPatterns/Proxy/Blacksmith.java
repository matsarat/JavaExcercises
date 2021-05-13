package com.example.java.maven.Excercises.DesignPatterns.Proxy;

public class Blacksmith implements BlacksmithInterface{

    @Override
    public String buySword() {
        return "Sword";
    }

    @Override
    public String buyAxe() {
        return "Axe";
    }
}
