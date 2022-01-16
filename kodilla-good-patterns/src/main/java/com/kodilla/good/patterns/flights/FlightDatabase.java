package com.kodilla.good.patterns.flights;

import java.util.Random;

public class FlightDatabase
{
    private FlightsCreator flightsCreator;

    public void createFlights()
    {
        flightsCreator = new FlightsCreator();

        String city1 = "Warszawa";
        String city2 = "Krakow";
        String city3 = "Wroclaw";
        String city4 = "Gdansk";
        String city5 = "Bydgoszcz";

        flightsCreator.addFlight(new Flight(city1, city2));
        flightsCreator.addFlight(new Flight(city1, city3));
        flightsCreator.addFlight(new Flight(city1, city4));
        flightsCreator.addFlight(new Flight(city1, city5));
        flightsCreator.addFlight(new Flight(city2, city1));
        flightsCreator.addFlight(new Flight(city3, city1));
        flightsCreator.addFlight(new Flight(city4, city1));
        flightsCreator.addFlight(new Flight(city5, city1));
        flightsCreator.addFlight(new Flight(city3, city2));
        flightsCreator.addFlight(new Flight(city4, city2));
        flightsCreator.addFlight(new Flight(city5, city2));
        flightsCreator.addFlight(new Flight(city4, city1));
        flightsCreator.addFlight(new Flight(city5, city1));
        flightsCreator.addFlight(new Flight(city3, city2));
        flightsCreator.addFlight(new Flight(city4, city2));
        flightsCreator.addFlight(new Flight(city5, city2));
        flightsCreator.addFlight(new Flight(city1, city2));
        flightsCreator.addFlight(new Flight(city1, city3));
        flightsCreator.addFlight(new Flight(city1, city4));
        flightsCreator.addFlight(new Flight(city1, city5));
        flightsCreator.addFlight(new Flight(city2, city1));
        flightsCreator.addFlight(new Flight(city3, city1));
        flightsCreator.addFlight(new Flight(city4, city1));
        flightsCreator.addFlight(new Flight(city5, city1));
        flightsCreator.addFlight(new Flight(city3, city2));
        flightsCreator.addFlight(new Flight(city4, city2));
        flightsCreator.addFlight(new Flight(city5, city2));
        flightsCreator.addFlight(new Flight(city4, city1));
        flightsCreator.addFlight(new Flight(city5, city1));
        flightsCreator.addFlight(new Flight(city3, city2));
        flightsCreator.addFlight(new Flight(city4, city2));
        flightsCreator.addFlight(new Flight(city5, city2));
    }
}
