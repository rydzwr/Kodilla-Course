package com.kodilla.stream.world;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

public class WorldTestSuite
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
    private World worldMock;

}
