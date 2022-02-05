package com.kodilla.hibernate.tasklist.dao;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite
{
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName()
    {

        //Given

        final String exampleListName = "List Name";
        final String exampleDescription = "Description";

        TaskList taskList = new TaskList(exampleListName, exampleDescription);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When

        List<TaskList> readTask = taskListDao.findByListName(listName);

        //Then

        Assert.assertEquals(listName, exampleListName);

        //CleanUp

        taskListDao.deleteById(readTask.get(0).getId());
    }
}
