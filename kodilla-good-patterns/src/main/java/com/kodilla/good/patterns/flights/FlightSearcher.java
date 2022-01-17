package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    FlightDatabase flightDatabase = new FlightDatabase();

    ArrayList<Flight> flightsList = flightDatabase.getFlightsList();

    public void searchByDepartureAirport(String departureCity) {
        List<String> byDepartureList = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        if (!byDepartureList.isEmpty()) {
            System.out.println("List of flights from " + departureCity + ":");
            byDepartureList.stream()
                    .forEach(System.out::println);

            System.out.println();
        }
        else
            System.out.println("Departure airport not found. Please try again.");
    }

    public void searchByArrivalAirport(String arrivalCity) {
        List<String> byArrivalList = flightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        if (!byArrivalList.isEmpty()) {
            System.out.println("List of flights to " + arrivalCity + ":");
            byArrivalList.stream()
                    .forEach(System.out::println);

            System.out.println();
        }
        else
            System.out.println("Arrival airport not found. Please try again.");
    }

    public void searchWithStopover(String departureCity, String arrivalCity, String transferCity) {
        List<String> beforeStopover = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureCity) && flight.getArrivalAirport().equals(transferCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        List<String> afterStopover = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(transferCity) && flight.getArrivalAirport().equals(arrivalCity))
                .map(flight -> flight.toString())
                .collect(Collectors.toList());

        HashMap<List, List> withStopover = new HashMap<>();
        withStopover.put(beforeStopover, afterStopover);

        if (!withStopover.get(beforeStopover).isEmpty() && !withStopover.values().isEmpty()) {
            System.out.println("List of flights from " + departureCity + " to " + arrivalCity + " with stopover in " + transferCity + ":");
            System.out.println();

            System.out.println("Flights from " + departureCity + " to " + transferCity + ":");
            beforeStopover.stream().forEach(System.out::println);

            System.out.println();

            System.out.println("Flights from " + transferCity + " to " + arrivalCity + ":");
            afterStopover.stream().forEach(System.out::println);

            System.out.println();
        }
        else
            System.out.println("At least one of entered airports not found \" +\n" +
                    "                    \"or flight from \" + departureCity + \" to \" + arrivalCity + \" via \" + transferCity + \" is not possible. Please try again.");

    }
}
