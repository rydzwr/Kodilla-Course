package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task
{
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint)
    {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
