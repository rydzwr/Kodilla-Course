package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class ListBuilder
{
    int listSize;

    Random random = new Random();

    public ListBuilder(int listSize)
    {
        this.listSize = listSize;
    }

    public ArrayList<Integer> buildList()
    {
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < listSize; i++)
        {
            numbersList.add(i);
        }

        return numbersList;
    }
}
