package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class OddNumbersExterminator
{
    Random random = new Random();

    ListBuilder listBuilder = new ListBuilder(random.nextInt());

    ArrayList list;

    public OddNumbersExterminator(ArrayList list)
    {
        this.list = list;
    }

    public ArrayList exterminator(ArrayList<Integer> emptyList)
    {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            int temporaryNumber = (int) list.get(i);
            if (temporaryNumber % 2 == 0)
                evenNumbers.add(temporaryNumber);
        }
        return (ArrayList) evenNumbers;
    }

}
