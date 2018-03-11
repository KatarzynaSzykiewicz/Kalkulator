package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class Products {
    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
