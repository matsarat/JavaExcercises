package com.example.java.maven.Excercises.DesignPatterns.Prototype;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ElvenBowTest {

    @Test
    void shouldCopyProvidedObject() {
        //given
        ElvenBow elvenBow = new ElvenBow(100, 50);

        //when
        ElvenBow copy = elvenBow.copy();

        //then
        assertThat(copy).isInstanceOf(ElvenBow.class);
        assertNotEquals(elvenBow, copy);
        assertThat(elvenBow.getDamage()).isEqualTo(copy.getDamage());
        assertThat(elvenBow.getRange()).isEqualTo(copy.getRange());
        assertThat(elvenBow.getBowType()).isEqualTo(copy.getBowType());
    }
}
