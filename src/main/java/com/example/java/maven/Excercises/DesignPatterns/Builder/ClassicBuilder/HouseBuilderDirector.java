package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

public class HouseBuilderDirector {

    private final HouseBuilder houseBuilder;

    public HouseBuilderDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.createHouseObject();
        houseBuilder.houseType();
        houseBuilder.wallMaterial();
        houseBuilder.numberOfBedrooms();
        houseBuilder.numberOfBathrooms();
        houseBuilder.hasGarage();
        houseBuilder.hasSwimmingPool();
        return houseBuilder.returnHouse();
    }

}
