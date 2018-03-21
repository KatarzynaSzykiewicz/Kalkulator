package com.kodilla.good.patterns.challenges.flightFinder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    List<Flight> destinations = new ArrayList<>();
    private String cityTo;
    private String cityFrom;
    private LocalDate dateOfDeparture;

    public static void main(String[] args) {

        Flight flight1 = new Flight("GDANSK", "KRAKOW", LocalDate.now());
        Flight flight2 = new Flight("GDANSK", "WARSZAWA", LocalDate.now());
        Flight flight3 = new Flight("KRAKOW", "WROCLAW", LocalDate.now());

        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        new FlightFinder(flights, "WROCLAW", "GDANSK", LocalDate.now()).findTheFlight();

    }


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


        List<String> citiesInTheMiddle = allFlightsFromACity.stream()
                .map(flight -> flight.getCityOfArrival())
                .collect(Collectors.toList());

        List<Flight> secondFlight = allFlightsToACity.stream()
                .filter(flight -> citiesInTheMiddle.contains(flight.getCityOfDeparture()))
                .collect(Collectors.toList());

        List<String> secondFlightDeparturesCities = secondFlight.stream().map(flight -> flight.getCityOfDeparture()).collect(Collectors.toList());

        List<Flight> firstFlight = allFlightsFromACity.stream()
                .filter(flight -> secondFlightDeparturesCities.contains(flight.getCityOfArrival()))
                .collect(Collectors.toList());

        // firstFlight + secondFlight


        System.out.println("You can reach " + cityTo + ", from " + cityFrom + ", on " + dateOfDeparture + ", flying " +
                "using flight: " +  firstFlight.get(0) + " "+secondFlight.get(0));
    }


    public FlightFinder(List<Flight> destinations, String cityTo, String cityFrom, LocalDate dateOfDeparture) {
        this.destinations = destinations;
        this.cityTo = cityTo;
        this.cityFrom = cityFrom;
        this.dateOfDeparture = dateOfDeparture;
    }

    public List<Flight> getDestinations() {
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
