package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Random;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite
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

    @Mock
    private Statistics statisticsMock;

    Random random = new Random();

    int createThousandPosts()
    {
        int temporaryPosts = 1000;
        return temporaryPosts;
    }

    ArrayList<String> generateUserNames(int usersCount)
    {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < usersCount; i++)
            users.add("");

        return users;
    }

    @Test
    void normalTest()
    {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(generateUserNames(3));
        when(statisticsMock.commentsCount()).thenReturn(28);

        //When
        statisticsCalculator.calculateAdvStatistics();

        //Then
        Assertions.assertEquals(statisticsCalculator.commentsAveragePerPost, 2.8);         // 28 / 10 = 2.8
        Assertions.assertEquals(statisticsCalculator.commentsAveragePerUser, 28.0 / 3.0);  // 28 / 3 = 9.(333)
        Assertions.assertEquals(statisticsCalculator.postsAveragePerUser, 10.0 / 3.0);     // 10 / 3 = 3.(333)
    }

    @Test
    void ifNoPosts()
    {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateUserNames(3));
        when(statisticsMock.commentsCount()).thenReturn(28);

        //When


        //Then
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->  statisticsCalculator.calculateAdvStatistics());
        System.out.println("Test Successful, exception message: " + exception.getMessage());
    }

    @Test
    void ifNoComments()
    {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(generateUserNames(3));
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When


        //Then
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->  statisticsCalculator.calculateAdvStatistics());
        System.out.println("Test Successful, exception message: " + exception.getMessage());
    }

    @Test
    void ifNoUsers()
    {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(generateUserNames(0));
        when(statisticsMock.commentsCount()).thenReturn(28);

        //When


        //Then
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->  statisticsCalculator.calculateAdvStatistics());
        System.out.println("Test Successful, exception message: " + exception.getMessage());
    }


    // Jako, że jest to zadanie dodatkowe, postanowiłem je zrobić inaczej - lepiej.
    // Napisałem tylko testy, które mają logiczny sens istnienia.

}
