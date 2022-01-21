package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task
{
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using)
    {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    @Override
    public boolean executeTask()
    {
        return true;
    }

    @Override
    public String getTaskName()
    {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted()
    {
        if (executeTask())
            return true;
        else return false;
    }
}
