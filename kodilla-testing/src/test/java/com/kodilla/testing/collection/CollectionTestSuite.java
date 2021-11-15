package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("TDD: Collection Tests: ")
public class CollectionTestSuite
{
    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest()
    {

        System.out.println("Preparing to execute test #");
    }

    @AfterEach
    public void afterEveryTest()
    {
        System.out.println("Test Finished");
    }

    @DisplayName("If Empty List?")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
        ListBuilder listBuilder = new ListBuilder(0);
        ArrayList emptyList = listBuilder.buildList();
        ArrayList<Integer> emptyList1 = new ArrayList<>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(emptyList);

        //Then
        Assertions.assertEquals(emptyList1, oddNumbersExterminator.exterminator(emptyList));
    }

    @DisplayName("If Normal List?")
    @Test
    void testOddNumbersExterminatorNormalList()
    {
        //Given
        ListBuilder listBuilder = new ListBuilder(10);
        ArrayList<Integer> normalList = listBuilder.buildList();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(normalList);

        //Then
        Assertions.assertEquals(list, oddNumbersExterminator.exterminator(normalList));
    }
}
