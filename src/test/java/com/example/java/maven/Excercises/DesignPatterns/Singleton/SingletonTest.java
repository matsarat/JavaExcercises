package com.example.java.maven.Excercises.DesignPatterns.Singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SingletonTest {

    static Singleton obj1;
    static Singleton obj2;

    @BeforeAll
    static void beforeAll() {
         obj1 = Singleton.getInstance();
         obj2 = Singleton.getInstance();
    }

    @Test
    void shouldReturnTrueIfGivenObjectsAreInstancesOfSingleton() {

        Assertions.assertThat(obj1).isInstanceOf(Singleton.class);
        Assertions.assertThat(obj2).isInstanceOf(Singleton.class);
    }

    @Test
    void shouldReturnTrueIfMethodReturnsTheSameInstanceOfSingleton() {

        Assertions.assertThat(obj1).isEqualTo(obj2);
    }
}