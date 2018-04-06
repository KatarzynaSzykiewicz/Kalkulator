package com.kodilla.patterns.factory.task;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    final boolean completed;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity, final boolean completed) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.completed = completed;
    }

    @Override
    public String executeTask() {
        return "Shopping list: " + whatToBuy + ", the quantity " + quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (completed) {
            System.out.println("Shopping task is completed.");
        } else {
                System.out.println("Shopping task is not completed.");
            }
            return true;
    }
}
