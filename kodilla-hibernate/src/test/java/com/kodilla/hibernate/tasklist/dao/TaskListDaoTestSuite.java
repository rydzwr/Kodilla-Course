package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite
{
    @Autowired
    private TaskListDao taskListDao;

    final static String exampleListName = "List Name";
    final static String exampleDescription = "Description";

    @Test
    public void testFindByListName()
    {

        //Given

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

    @Test
    void testTaskListDaoSaveWithTasks() {

        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(exampleListName, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assertions.assertEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id + 5);
    }
}
