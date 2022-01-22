package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        // Given

        TaskFactory taskFactory = new TaskFactory();

        // When

        Task shoppingTask = taskFactory.doTask(TaskFactory.SHOPPING_TASK);

        // Then

        Assertions.assertEquals(shoppingTask.getTaskName(), "Shopping");
    }

    @Test
    public void testFactoryPaintingTask() {
        // Given

        TaskFactory taskFactory = new TaskFactory();

        // When

        Task paintingTask = taskFactory.doTask(TaskFactory.PAINTING_TASK);

        // Then

        Assertions.assertEquals(paintingTask.getTaskName(), "Painting");
    }

    @Test
    public void testFactoryDrivingTask() {
        // Given

        TaskFactory taskFactory = new TaskFactory();

        // When

        Task drivingTask = taskFactory.doTask(TaskFactory.DRIVING_TASK);

        // Then

        Assertions.assertEquals(drivingTask.getTaskName(), "Driving");
    }
}
