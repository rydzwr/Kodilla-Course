package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast
{
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures)
    {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast()
    {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet())
        {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double temperatureAverage()
    {
        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> temperaturesInArray = new ArrayList<>(values);

        double sum = 0;
        double average = 0;

        for (int j = 0; j < temperaturesInArray.size(); j++)
        {
            sum += temperaturesInArray.get(j);
        }

        average = sum / temperaturesInArray.size();
        
        return average;
    }

    public double findMedian()
    {
        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> temperaturesInArray = new ArrayList<>(values);

        Collections.sort(temperaturesInArray);
        int middle = temperaturesInArray.size() / 2;
        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;
        return temperaturesInArray.get(middle);
    }
}