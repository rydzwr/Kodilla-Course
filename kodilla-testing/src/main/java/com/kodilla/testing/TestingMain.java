package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class TestingMain
{
    public static void main(String[] args)
    {
        Random random = new Random();

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i< random.nextInt(50) + 10; i++)
            numbers.add(random.nextInt(200) + 20);

        System.out.println(OddNumbersExterminator.exterminate(numbers));


    }
}

