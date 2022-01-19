package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    ArrayList<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}
