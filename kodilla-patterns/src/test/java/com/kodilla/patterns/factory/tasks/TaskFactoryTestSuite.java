package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite
{
    @Test
    public void testFactoryShoppingTask()
    {
        // Given

        TaskFactory taskFactory = new TaskFactory();

        // When

        Task shoppingTask = taskFactory.doTask(TaskFactory.SHOPPING_TASK);

        // Then

        Assertions.assertEquals(shoppingTask.getTaskName(), "Shopping");
    }

    @Test
    public void testFactoryPaintingTask()
    {

    }

    @Test
    public void testFactoryDrivingTask()
    {

    }
}
