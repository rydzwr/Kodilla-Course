package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Random;

public class FlightsDatabase
{
    Random random = new Random();

    private ArrayList<Flight> flightsList;

    private void createFligtsList()
    {

        flightsList = new ArrayList<>();

        int flightsCount = random.nextInt(20);

        for (int i = 0; i < flightsCount; i++)
        {
            flightsList.add(new Flight(generateRandomAirport(), generateRandomAirport()));
        }
    }

    // ***
    // *********** Remember To Avoid Generate Two Same Airports! ***********
    // ***

    private String generateRandomAirport()
    {
        String gdansk = "Gdansk";
        String warszawa = "Warszawa";
        String wroclaw = "Wroclaw";

        int randomN = random.nextInt(3);

        if (randomN == 0)
            return gdansk;
        else if (randomN == 1)
            return warszawa;
        else if (randomN == 2)
            return wroclaw;
        else
            return "Generate Random Airport Failed!";
    }
}
