package com.kodilla.good.patterns.challenges.flightFinder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    ArrayList<Flight> destinations = new ArrayList<>();
    private String cityTo;
    private String cityFrom;
    private LocalDate dateOfDeparture;


    public void findTheFlight() {
        List<Flight> allFlightsFromACity = destinations.stream()
                .filter(s -> s.getFlightDate().isEqual(getDateOfDeparture()))
                .filter(s -> s.getCityOfDeparture().equals(getCityFrom()))
                .collect(Collectors.toList());

        System.out.println("Direct flights from " + cityFrom + ", on the " + dateOfDeparture + " are to: " + allFlightsFromACity);


        List<Flight> allFlightsToACity = destinations.stream()
                .filter(s -> s.getFlightDate().isEqual(getDateOfDeparture()))
                .filter(s -> s.getCityOfArrival().equals(getCityTo()))
                .collect(Collectors.toList());

        System.out.println("Direct flights to " + cityTo + ", on the " + dateOfDeparture + " are from " + allFlightsToACity);


        List<Flight> common = new ArrayList<>(allFlightsFromACity);
        common.retainAll(allFlightsToACity);

        System.out.println("You can reach " + cityTo + ", from " + cityFrom + ", on " + dateOfDeparture + ", flying through: " + common);
    }


    public FlightFinder(ArrayList<Flight> destinations, String cityTo, String cityFrom, LocalDate dateOfDeparture) {
        this.destinations = destinations;
        this.cityTo = cityTo;
        this.cityFrom = cityFrom;
        this.dateOfDeparture = dateOfDeparture;
    }

    public ArrayList<Flight> getDestinations() {
        return destinations;
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }
}
