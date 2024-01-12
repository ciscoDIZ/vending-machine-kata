package com.leanmind;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class VendingShould {
    @Test
    public void be_have_products() {
        Vending vending = new Vending();

        Assertions.assertEquals(1, vending.getProducts().size());
    }

    @Test
    public void show_inserted_coin() {
        Vending vending = new Vending();
        Coin quarter = new Quarter();

        vending.insert(quarter);

        Assertions.assertEquals("0.25$", vending.getDisplayMessage());
    }

    @Test
    public void show_inserted_coins() {
        Vending vending = new Vending();

        vending.insert(new Quarter());
        vending.insert(new Quarter());

        Assertions.assertEquals("0.50$", vending.getDisplayMessage());
    }
}
