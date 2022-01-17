package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Random;

public class FlightDatabase {
    private ArrayList<Flight> flightsList = new ArrayList<>();
    ArrayList<String> cities;

    public ArrayList<Flight> getFlightsList() {
        createFlights();

        return flightsList;
    }

    public ArrayList<Flight> createFlights() {
        Random random = new Random();

        cities = new ArrayList<>();
        cities.add("Warszawa");
        cities.add("Krakow");
        cities.add("Wroclaw");
        cities.add("Gdansk");
        cities.add("Bydgoszcz");

        int randomFlightsCount = random.nextInt(60) + 30;

        for (int i = 0; i < randomFlightsCount; i++) {
            ArrayList<String> citiesCopy = (ArrayList<String>) cities.clone();

            int generateFirst = random.nextInt(citiesCopy.size());
            String firstCiy = citiesCopy.get(generateFirst);
            citiesCopy.remove(generateFirst);

            int generateSecond = random.nextInt(citiesCopy.size());
            String secondCity = citiesCopy.get(generateSecond);

            flightsList.add(new Flight(firstCiy, secondCity));
        }

        return flightsList;
    }
}
