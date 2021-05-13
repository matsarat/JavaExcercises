package com.example.java.maven.Excercises.DesignPatterns.Builder.ClassicBuilder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class HouseBuilderDirectorTest {
    static HouseBuilderDirector woodenLodgeBuildingDirector;
    static HouseBuilderDirector luxuriousMansionBuildingDirector;

    @BeforeAll
    static void setUp() {
        woodenLodgeBuildingDirector = new HouseBuilderDirector(new WoodenLodge());
        luxuriousMansionBuildingDirector = new HouseBuilderDirector(new LuxuriousMansion());
    }

    @Test
    void shouldBuildWoodenLodge() {

        //when
        House woodenLodge = woodenLodgeBuildingDirector.buildHouse();

        //then
        assertThat(woodenLodge).isInstanceOf(House.class);
        assertThat(woodenLodge.getHouseType()).isEqualTo("Wooden Lodge");
        assertThat(woodenLodge.getWallMaterial()).isEqualTo("Wood");
        assertThat(woodenLodge.getNumberOfBathrooms()).isEqualTo(1);
        assertThat(woodenLodge.getNumberOfBedrooms()).isEqualTo(2);
        assertFalse(woodenLodge.hasGarage());
        assertFalse(woodenLodge.hasSwimmingPool());
    }

    @Test
    void shouldBuildLuxuriousMansion() {

        //when
        House luxuriousMansion = luxuriousMansionBuildingDirector.buildHouse();

        //then
        assertThat(luxuriousMansion).isInstanceOf(House.class);
        assertThat(luxuriousMansion.getHouseType()).isEqualTo("Luxurious Mansion");
        assertThat(luxuriousMansion.getWallMaterial()).isEqualTo("Concrete");
        assertThat(luxuriousMansion.getNumberOfBathrooms()).isEqualTo(4);
        assertThat(luxuriousMansion.getNumberOfBedrooms()).isEqualTo(6);
        assertTrue(luxuriousMansion.hasGarage());
        assertTrue(luxuriousMansion.hasSwimmingPool());
    }
}
