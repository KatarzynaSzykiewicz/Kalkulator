package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private  HashMap<Flight, Boolean> flights;

    public FlightFinder(HashMap<Flight, Boolean> flights) {
        this.flights = flights;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flights.get(flight) != null) {
            System.out.println("Route: " + flight + "is available.");
        } else {
            throw new RouteNotFoundException("Route not found");
        }
    }
}
