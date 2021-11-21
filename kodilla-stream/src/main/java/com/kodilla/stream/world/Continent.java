package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent
{
    ArrayList<Country> countriesList = new ArrayList<>();

    void createCountriesList()
    {
        countriesList.add(new Country());
        countriesList.add(new Country());
        countriesList.add(new Country());
        countriesList.add(new Country());
        countriesList.add(new Country());
    }

    ArrayList<Country> getCountriesList()
    {
        return countriesList;
    }
}
