package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<Flight, Boolean> flights = new HashMap<>();
        if (flights.get(flight) != null) {
            System.out.println("Route: " + flight + "is available.");
        }
        throw new RouteNotFoundException("Route not found");
    }
}
