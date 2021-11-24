package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {1, 2, 3, 4, 5};
        double averageExpected = 3.0;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(averageExpected, average, 0.001);
    }
}