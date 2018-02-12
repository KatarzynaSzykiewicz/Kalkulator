package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final String countryName;
    private final BigDecimal numberOfPeople;
    private final HashMap<Continent, Country> countries = new HashMap<>();

    public Continent(String countryName, BigDecimal numberOfPeople) {
        this.countryName = countryName;
        this.numberOfPeople = numberOfPeople;
    }

    public Set<BigDecimal>getNumberOfPeopleInCountries(){
        return countries.stream()
                .map(country -> country.getNumberOfPeople())
                .collect(Collectors.toSet());
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }

    public HashMap<Continent, Country> getCountries(){
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countryName, continent.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }
}
