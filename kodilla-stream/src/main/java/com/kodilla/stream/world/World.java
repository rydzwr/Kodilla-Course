package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.*;


public class World
{
    ArrayList<Continent> continentsList = new ArrayList<>();

    void createContinentsList()
    {
        continentsList.add(new Continent());
        continentsList.add(new Continent());
        continentsList.add(new Continent());
        continentsList.add(new Continent());
        continentsList.add(new Continent());
    }

    BigDecimal getPeopleQuantity()
    {
        BigDecimal totalSand = (BigDecimal) continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toSet());

        return totalSand;
    }
}
