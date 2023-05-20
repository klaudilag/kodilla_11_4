package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskExecuted = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Wykonano zadanie " + taskName);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
