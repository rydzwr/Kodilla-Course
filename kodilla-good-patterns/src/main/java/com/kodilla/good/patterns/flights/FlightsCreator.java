package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

public class FlightsCreator
{
    private ArrayList<Flight> flightsList = new ArrayList<>();

    public void addFlight(Flight flight)
    {
        flightsList.add(flight);
    }

    public ArrayList<Flight> getFlightsList()
    {
        return flightsList;
    }
}
