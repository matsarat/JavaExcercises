package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

public class House {

    private String houseType;
    private String wallMaterial;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public String getHouseType() {
        return houseType;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", wallMaterial='" + wallMaterial + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
