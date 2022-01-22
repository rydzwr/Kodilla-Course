package com.kodilla.patterns.factory.tasks;

public interface Task {
    boolean executeTask(String taskName);
    String getTaskName();
    boolean isTaskExecuted();
}
