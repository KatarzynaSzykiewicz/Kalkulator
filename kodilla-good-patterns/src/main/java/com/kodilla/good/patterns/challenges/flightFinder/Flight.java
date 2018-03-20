package com.kodilla.good.patterns.challenges.flightFinder;

import java.time.LocalDate;
import java.util.Objects;

public class Flight {
    String cityOfDeparture;
    String cityOfArrival;
    LocalDate flightDate;

    public Flight(String cityOfDeparture, String cityOfArrival, LocalDate flightDate) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
        this.flightDate = flightDate;
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(cityOfDeparture, flight.cityOfDeparture) &&
                Objects.equals(cityOfArrival, flight.cityOfArrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cityOfDeparture, cityOfArrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "cityOfDeparture='" + cityOfDeparture + '\'' +
                ", cityOfArrival='" + cityOfArrival + '\'' +
                ", flightDate=" + flightDate +
                '}';
    }
}
