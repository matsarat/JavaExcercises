package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

public class WoodenLodge implements HouseBuilder{

    private House woodenLodge;
    private static final String HOUSE_TYPE = "Wooden Lodge";

    @Override
    public void createHouseObject() {
        this.woodenLodge = new House();
    }

    @Override
    public void houseType() {
        woodenLodge.setHouseType(HOUSE_TYPE);
    }

    @Override
    public void wallMaterial() {
        woodenLodge.setWallMaterial("Wood");
    }

    @Override
    public void numberOfBedrooms() {
        woodenLodge.setNumberOfBedrooms(2);
    }

    @Override
    public void numberOfBathrooms() {
        woodenLodge.setNumberOfBathrooms(1);
    }

    @Override
    public void hasGarage() {
        woodenLodge.setHasGarage(false);
    }

    @Override
    public void hasSwimmingPool() {
        woodenLodge.setHasSwimmingPool(false);
    }

    @Override
    public House returnHouse() {
        House woodenLodge = this.woodenLodge;
        return woodenLodge;
    }
}
