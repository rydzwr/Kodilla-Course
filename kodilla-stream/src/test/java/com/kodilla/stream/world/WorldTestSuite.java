package com.kodilla.stream.world;

import org.junit.jupiter.api.*;
import java.math.BigDecimal;

public class WorldTestSuite
{
    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest()
    {

        System.out.println("Preparing to execute test #");
    }

    @AfterEach
    public void afterEveryTest()
    {
        System.out.println("Test Finished");
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        BigDecimal countryPopulation = new BigDecimal("111111111");

        Country poland = new Country("Poland", countryPopulation);
        Country germany = new Country("Germany", countryPopulation);
        Country spain = new Country("Spain", countryPopulation);

        Country japan = new Country("Japan", countryPopulation);
        Country china = new Country("China", countryPopulation);
        Country mongolia = new Country("Mongolia", countryPopulation);

        Country egypt = new Country("Egypt", countryPopulation);
        Country morocco = new Country("Morocco", countryPopulation);
        Country ghana = new Country("Ghana", countryPopulation);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addToList(poland);
        europe.addToList(germany);
        europe.addToList(spain);
        asia.addToList(japan);
        asia.addToList(china);
        asia.addToList(mongolia);
        africa.addToList(egypt);
        africa.addToList(morocco);
        africa.addToList(ghana);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("999999999");

        //Then
        Assertions.assertEquals(expectedWorldPeopleQuantity, worldPeopleQuantity);
    }

}
