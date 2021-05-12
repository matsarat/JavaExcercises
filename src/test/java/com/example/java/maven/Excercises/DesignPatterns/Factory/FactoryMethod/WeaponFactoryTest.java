package com.example.java.maven.Excercises.DesignPatterns.Factory.FactoryMethod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeaponFactoryTest {
    static WeaponFactory weaponFactory;

    @BeforeAll
    static void setUp() {
        weaponFactory = new WeaponFactory();
    }

    @ParameterizedTest(name = "{index} => providedString={0}, expectedWeapon={1}")
    @CsvSource({
            "sword, Sword",
            "SWORD, Sword",
            "axe, Axe",
            "AXE ,Axe",
    })
    void shouldReturnExpectedWeaponType(String providedString, String expectedWeapon) {

        //when
        Weapon weapon = weaponFactory.createWeapon(providedString);

        //then
        assertThat(weapon).isInstanceOf(Weapon.class);
        assertThat(weapon.getWeaponType()).isEqualTo(expectedWeapon);
    }


    @ParameterizedTest(name = "{index} => providedString={0}")
    @CsvSource({
            ",",
            "' '",
            "Elven sword",
            "21 table spoons",
            "'sword '",
            "'SW ORD'"
    })
    public void shouldThrowIllegalArgumentException(String providedString) {

        assertThrows(IllegalArgumentException.class,
                () -> weaponFactory.createWeapon(providedString));
    }

    @ParameterizedTest(name = "{index} => providedString={0}, expectedDamage={1}")
    @CsvSource({
            "sword, 50",
            "axe, 100",
    })
    void shouldReturnDealtDamage(String providedString, int expectedDamage) {

        //when
        Weapon weapon = weaponFactory.createWeapon(providedString);

        //then
        assertThat(weapon).isInstanceOf(Weapon.class);
        assertThat(weapon.getDealtDamage()).isEqualTo(expectedDamage);
    }
}
