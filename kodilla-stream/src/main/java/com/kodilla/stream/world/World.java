/*
package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;


public final class World {
    private final String continentName;
    private final HashMap<Continent, Country> continents = new HashMap<>();

    public World(String continentName) {
        this.continentName = continentName;
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Continent::getNumberOfPeopleInCountries)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        System.out.println("The number of people is " + continents);

    }
}
*/
