package com.kodilla.good.patterns.flights;

public class Application
{
    public static void main(String[] args)
    {
        FlightDatabase flightDatabase = new FlightDatabase();

        flightDatabase.createFlights();

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.searchByDepartureAirport("Bydgoszcz");
        flightSearcher.searchByArrivalAirport("Wroclaw");
        flightSearcher.searchWithStopover("Bydgoszcz", "Wroclaw", "Warszawa");
    }
}
