package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

public interface HouseBuilder {

    void createHouseObject();
    void houseType();
    void wallMaterial();
    void numberOfBedrooms();
    void numberOfBathrooms();
    void hasGarage();
    void hasSwimmingPool();
    House returnHouse();
}
