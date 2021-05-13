package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

public class LuxuriousMansion implements HouseBuilder{

    private House luxuriousMansion;

    private static final String HOUSE_TYPE = "Luxurious Mansion";


    public void createHouseObject() {
        this.luxuriousMansion = new House();
    }

    @Override
    public void houseType() {
        luxuriousMansion.setHouseType(HOUSE_TYPE);
    }

    @Override
    public void wallMaterial() {
        luxuriousMansion.setWallMaterial("Concrete");
    }

    @Override
    public void numberOfBedrooms() {
        luxuriousMansion.setNumberOfBedrooms(6);
    }

    @Override
    public void numberOfBathrooms() {
        luxuriousMansion.setNumberOfBathrooms(4);
    }

    @Override
    public void hasGarage() {
        luxuriousMansion.setHasGarage(true);
    }

    @Override
    public void hasSwimmingPool() {
        luxuriousMansion.setHasSwimmingPool(true);
    }

    @Override
    public House returnHouse() {
        House luxuriousMansion = this.luxuriousMansion;
        return luxuriousMansion;
    }




}
