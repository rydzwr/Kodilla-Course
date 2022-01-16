package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher
{
    FlightsCreator flightsCreator = new FlightsCreator();

    private ArrayList<Flight> flightsList = flightsCreator.getFlightsList();

    public void searchByDepartureAirport(String departureCity)
    {
        List<String> byDepartureList = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        if (!byDepartureList.isEmpty())
        {
            System.out.println(byDepartureList);
        }
        else
            System.out.println("You Fucked Up STH!");
    }

    public void searchByArrivalAirport(String arrivalCity)
    {
        List<String> byArrivalList = flightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        if (!byArrivalList.isEmpty())
        {
            byArrivalList.stream()
                    .forEach(System.out::println);
        }
        else
            System.out.println("You Fucked Up STH!");
    }

    public void searchWithStopover(String departureCity, String arrivalCity, String transferCity)
    {
        List<String> withStopover = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity) && flight.getArrivalAirport().equals(transferCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(transferCity) && flight.getArrivalAirport().equals(arrivalCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        if (!withStopover.isEmpty())
        {
            withStopover.stream()
                    .forEach(System.out::println);
        }
        else
            System.out.println("You Fucked Up STH!");

    }
}
