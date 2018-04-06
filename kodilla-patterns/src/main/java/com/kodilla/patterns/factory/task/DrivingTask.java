package com.kodilla.patterns.factory.task;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final boolean completed;

    public DrivingTask(final String taskName, final String where, final String using, final boolean completed) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.completed = completed;
    }

    @Override
    public String executeTask() {
        return "Drive to " + where + ", using " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (completed) {
            System.out.println("Driving task is completed.");
        } else {
            System.out.println("Driving task is not completed.");
        }
        return false;
    }
}
