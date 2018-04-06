package com.kodilla.patterns.factory.task;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    final boolean completed;

    public PaintingTask(final String taskName, final String color, final String whatToPaint, final boolean completed) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.completed = completed;
    }

    @Override
    public String executeTask() {
        return "A task is to paint " + whatToPaint + " " + color;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (completed) {
            System.out.println("Painting task is completed.");
        } else {
            System.out.println("Painting task is not completed.");
        }
        return true;
    }
}
