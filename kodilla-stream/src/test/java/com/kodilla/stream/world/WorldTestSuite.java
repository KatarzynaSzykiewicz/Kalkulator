package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Set<Country> countriesOfEurope = new HashSet<>();

        Country poland = new Country();
        poland.setNumberOfCitizens(BigDecimal.valueOf(38_000_000));

        Country spain = new Country();
        spain.setNumberOfCitizens(BigDecimal.valueOf(46_500_000));

        Country island = new Country();
        island.setNumberOfCitizens(BigDecimal.valueOf(350_000));


        Set<Country> countriesOfAsia = new HashSet<>();

        Country china = new Country();
        china.setNumberOfCitizens(BigDecimal.valueOf(1_400_000_000));

        Country russia = new Country();
        russia.setNumberOfCitizens(BigDecimal.valueOf(150_000_000));

        Country indie = new Country();
        indie.setNumberOfCitizens(BigDecimal.valueOf(1_330_000_000));


        Set<Country> countriesOfAfrica = new HashSet<>();

        Country algeria = new Country();
        algeria.setNumberOfCitizens(BigDecimal.valueOf(40_610_000));

        Country kenya = new Country();
        kenya.setNumberOfCitizens(BigDecimal.valueOf(48_460_000));

        Country gambia = new Country();
        gambia.setNumberOfCitizens(BigDecimal.valueOf(2_039_000));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();


        countriesOfEurope.add(poland);
        countriesOfEurope.add(spain);
        countriesOfEurope.add(island);
        europe.setCountries(countriesOfEurope);

        countriesOfAsia.add(china);
        countriesOfAsia.add(russia);
        countriesOfAsia.add(indie);
        asia.setCountries(countriesOfAsia);

        countriesOfAfrica.add(algeria);
        countriesOfAfrica.add(kenya);
        countriesOfAfrica.add(gambia);
        africa.setCountries(countriesOfAfrica);

        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(africa);

        World  world = new World();
        world.setContinents(continents);

        //When
        BigDecimal result = world.getContinents()
                .stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getNumberOfCitizens())
                .reduce(BigDecimal.ZERO, ((sum, current) -> sum = sum.add(current)));

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3055959000");
        Assert.assertEquals(expectedPeopleQuantity, result);
    }
}
