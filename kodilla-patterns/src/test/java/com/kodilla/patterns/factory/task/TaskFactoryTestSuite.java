package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.shapeFactory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingList() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingList = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assert.assertEquals("Grocery", shoppingList.getTaskName());
        Assert.assertEquals("Shopping list: Bananas, the quantity 4.0", shoppingList.executeTask());
        Assert.assertEquals(true, shoppingList.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingList() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingList = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Garden house project", paintingList.getTaskName());
        Assert.assertEquals("A task is to paint kitchen's walls blue", paintingList.executeTask());
        Assert.assertEquals(true, paintingList.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingList() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingList = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Family trip", drivingList.getTaskName());
        Assert.assertEquals("Drive to the coast, using bicycles", drivingList.executeTask());
        Assert.assertEquals(false, drivingList.isTaskExecuted());
    }
}

