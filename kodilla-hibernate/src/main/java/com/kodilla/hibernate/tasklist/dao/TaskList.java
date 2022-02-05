package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public class TaskList
{
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks;

    public TaskList(String listName, String description)
    {
        this.listName = listName;
        this.description = description;
        this.tasks = new ArrayList<>();
    }

    public TaskList()
    {

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId()
    {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName()
    {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription()
    {
        return description;
    }

    public void setTasks(List<Task> tasks)
    {
        this.tasks = tasks;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setListName(String listName)
    {
        this.listName = listName;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}