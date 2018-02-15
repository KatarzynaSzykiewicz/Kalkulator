package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    public Set<Country> countries = new HashSet<>();

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                '}';
    }
}

