package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("LTN", "WRO");
        Flight flight2 = new Flight("WRO", "LTN");
        Flight flight3 = new Flight("GDN", "LTN");

        HashMap<Flight, Boolean> flights = new HashMap<>();
        flights.put(flight1, true);
        flights.put(flight2, true);


        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("The flight is not found.");
        }
    }
}
