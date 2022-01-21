package com.kodilla.patterns.factory.tasks;

public final class TaskFactory
{
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task doTask(final String taskClass)
    {
        switch (taskClass)
        {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Food", 10);
            case PAINTING_TASK:
                return new PaintingTask("Painting" , "White", "Wall");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Shop", "Car");
            default:
                return null;
        }
    }
}
