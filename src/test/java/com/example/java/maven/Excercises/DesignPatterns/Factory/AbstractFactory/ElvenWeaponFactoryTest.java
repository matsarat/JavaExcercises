package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElvenWeaponFactoryTest {
    static ElvenWeaponFactory elvenWeaponFactory;

    @BeforeAll
    static void setUp() {
        elvenWeaponFactory = new ElvenWeaponFactory();
    }

    @Test
    void shouldAssertThatElvenWeaponFactoryIsInstanceOfWeaponAbstractFactoryClass() {

        assertThat(elvenWeaponFactory).isInstanceOf(WeaponAbstractFactory.class);
    }

    @Test
    void shouldReturnElvenAxe() {

        //when
        Axe elvenAxe = elvenWeaponFactory.createAxe();

        //then
        assertThat(elvenAxe).isInstanceOf(Axe.class);
        assertThat(elvenAxe.getAxeType()).isEqualTo("Elven axe");
        assertThat(elvenAxe.getDealtDamage()).isEqualTo(70);
    }

    @Test
    void shouldReturnElvenBow() {

        //when
        Bow elvenBow = elvenWeaponFactory.createBow();

        //then
        assertThat(elvenBow).isInstanceOf(Bow.class);
        assertThat(elvenBow.getBowType()).isEqualTo("Elven bow");
        assertThat(elvenBow.getRange()).isEqualTo(100);
    }
}
