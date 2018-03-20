package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.ArrayList;

public class Destinations {
    ArrayList<Flight> destinations;

    public Destinations(ArrayList<Flight> destinations) {
        this.destinations = destinations;
    }

    public ArrayList<Flight> getDestinations() {
        return destinations;
    }
}
