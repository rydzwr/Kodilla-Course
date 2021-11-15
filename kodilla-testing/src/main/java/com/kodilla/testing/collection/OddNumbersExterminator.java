package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator
{

    public static List<Integer> exterminate(List<Integer> numbers)
    {
        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++)
        {
            int temporaryNumber = numbers.get(i);
            if (temporaryNumber % 2 == 0)
                evenNumbers.add(temporaryNumber);
        }

        return evenNumbers;
    }
}
