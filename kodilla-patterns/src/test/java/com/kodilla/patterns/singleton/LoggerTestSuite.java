package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite
{
    @Test
    public void testGetLastLog()
    {

        //Given
        Logger.getInstance().log("LOG");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then

        Assertions.assertEquals("LOG", log);
    }
}
