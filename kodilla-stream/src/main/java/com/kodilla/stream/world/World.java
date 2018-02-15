package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class World {

    private Set<Continent> continents = new HashSet<>();

    public Set<Continent> getContinents() {
        return continents;
    }

    public void setContinents(Set<Continent> continents) {
        this.continents = continents;
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }
}
