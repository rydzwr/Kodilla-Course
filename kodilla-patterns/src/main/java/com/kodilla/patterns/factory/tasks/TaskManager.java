package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;

public class TaskManager {
    private static TaskManager instance;
    private ArrayList<String > doneTasks = new ArrayList<>();

    public void archiveTask(String taskName) {
        doneTasks.add(taskName);
    }

    public static TaskManager getInstance() {
        if (instance == null)
            instance = new TaskManager();

        return instance;
    }

}
