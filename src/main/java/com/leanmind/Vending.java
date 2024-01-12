package com.leanmind;

import java.util.ArrayList;
import java.util.List;

interface Product {

}

class ProductA implements Product {

}

public class Vending {
    private final ArrayList<Product> products;

    public Vending() {
        this.products = new ArrayList<>();
        this.products.add(new ProductA());
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void insert(Coin quarter) {

    }

    public String getDisplayMessage() {
        return "0.25$";
    }
}
