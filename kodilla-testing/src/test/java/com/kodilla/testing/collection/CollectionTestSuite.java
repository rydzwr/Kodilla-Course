package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite
{
    @DisplayName("testOddNumbersExterminatorEmptyList")
    @BeforeEach
    public void before()
    {
        System.out.println("Testing Empty List Case");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(OddNumbersExterminator.exterminate(emptyList));
    }

    @DisplayName("testOddNumbersExterminatorNormalList")
    @AfterEach
    public void after()
    {
        System.out.println("Testing Normal List Case");
    }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        List<Integer> evenAndOddNumbers = new ArrayList<>();
        evenAndOddNumbers.add(1);
        evenAndOddNumbers.add(2);
        evenAndOddNumbers.add(3);
        evenAndOddNumbers.add(4);
        evenAndOddNumbers.add(5);
        evenAndOddNumbers.add(6);

        System.out.println(OddNumbersExterminator.exterminate(evenAndOddNumbers));
    }
    
}
