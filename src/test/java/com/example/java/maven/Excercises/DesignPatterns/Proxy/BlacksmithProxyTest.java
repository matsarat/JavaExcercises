package com.example.java.maven.Excercises.DesignPatterns.Proxy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlacksmithProxyTest {

    @Test
    void shouldBuyWeaponsFromBlacksmithUsingProxy() {

        //given
        BlacksmithProxy blacksmithProxy = new BlacksmithProxy(new Blacksmith());

        //when
        String boughtWeapon1 = blacksmithProxy.buyAxe();
        String boughtWeapon2 = blacksmithProxy.buySword();

        //then
        assertEquals("Axe", boughtWeapon1);
        assertEquals("Sword", boughtWeapon2);
    }
}