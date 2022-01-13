package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class World
{
    private final List<Continent> list = new ArrayList<Continent>();

    public boolean addContinent(Continent continent)
    {
        list.add(continent);
        return true;
    }

    public BigDecimal getPeopleQuantity()
    {
        BigDecimal population = list.stream()
                .map(Continent::getList)
                .flatMap(countryList -> countryList.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return population;
    }

    @Override
    public String toString()
    {
        return "World{" +
                "continentList=" + list +
                '}';
    }
}