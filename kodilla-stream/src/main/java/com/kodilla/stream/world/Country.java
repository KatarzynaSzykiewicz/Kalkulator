package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private BigDecimal numberOfCitizens;

    public BigDecimal getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public void setNumberOfCitizens(BigDecimal numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
    }

    @Override
    public String toString() {
        return "Country{" +
                "numberOfCitizens=" + numberOfCitizens +
                '}';
    }
}
