package com.example.java.maven.Excercises.DesignPatterns.Builder.InnerStaticFluentBuilder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonTest {

    @Test
    void shouldBuildPersonWithGivenArgs() {
        Person person = new Person.Builder()
                .name("Janusz")
                .surname("Januszewski")
                .age(50)
                .isAlive(true)
                .build();


        //then

        assertThat(person).isInstanceOf(Person.class);
        assertThat(person.getName()).isEqualTo("Janusz");
        assertThat(person.getSurname()).isEqualTo("Januszewski");
        assertThat(person.getAge()).isEqualTo(50);
        assertThat(person.isAlive()).isEqualTo(true);
    }



    @ParameterizedTest(name = "{index} => name={0}, surname={1}, age={2}, isAlive={3}")
    @CsvSource({
            "Janusz, '', 50, true",
            "'', Januszewski, 50, true",
            "Janusz, Januszewski, -1, true",
            "Janusz,, 50, true",
            ", Januszewski, 50, true",
    })
    public void shouldThrowIllegalArgumentException(String name, String surname, int age, boolean isAlive) {

        assertThrows(IllegalArgumentException.class,
                () -> new Person.Builder()
                        .name(name)
                        .surname(surname)
                        .age(age)
                        .isAlive(isAlive));
    }
}
