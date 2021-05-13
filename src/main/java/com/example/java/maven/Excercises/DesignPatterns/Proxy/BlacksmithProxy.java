package com.example.java.maven.Excercises.DesignPatterns.Proxy;

public class BlacksmithProxy implements BlacksmithInterface{

    private final Blacksmith blacksmith;

    public BlacksmithProxy(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    @Override
    public String buySword() {
        return blacksmith.buySword();

    }

    @Override
    public String buyAxe() {
        return blacksmith.buyAxe();
    }
}
