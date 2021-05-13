package com.example.java.maven.Excercises.DesignPatterns.Factory.AbstractFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DwarvenWeaponFactoryTest {

    static DwarvenWeaponFactory dwarvenWeaponFactory;

    @BeforeAll
    static void setUp() {
        dwarvenWeaponFactory = new DwarvenWeaponFactory();
    }

    @Test
    void shouldAssertThatDwarvenWeaponFactoryIsInstanceOfWeaponAbstractFactoryClass() {
        
        assertThat(dwarvenWeaponFactory).isInstanceOf(WeaponAbstractFactory.class);
    }

    @Test
    void shouldReturnDwarvenAxe() {
        
        //when
        Axe dwarvenAxe = dwarvenWeaponFactory.createAxe();
        
        //then
        assertThat(dwarvenAxe).isInstanceOf(Axe.class);
        assertThat(dwarvenAxe.getAxeType()).isEqualTo("Dwarven axe");
        assertThat(dwarvenAxe.getDealtDamage()).isEqualTo(100);
    }

    @Test
    void shouldReturnDwarvenBow() {

        //when
        Bow dwarvenBow = dwarvenWeaponFactory.createBow();

        //then
        assertThat(dwarvenBow).isInstanceOf(Bow.class);
        assertThat(dwarvenBow.getBowType()).isEqualTo("Dwarven bow");
        assertThat(dwarvenBow.getRange()).isEqualTo(50);
    }
}
