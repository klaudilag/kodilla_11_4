package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskFactoryTestSuite {

    @Test
    void creatingTaskTest() {
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        Assertions.assertEquals(driving.getTaskName(),"Driving task");
        Assertions.assertEquals(painting.getTaskName(), "Painting task");
        Assertions.assertEquals(shopping.getTaskName(),"Shopping task");
    }
    @Test
    void executingTaskTest(){
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        Assertions.assertTrue(driving.isTaskExecuted());
    }

}
