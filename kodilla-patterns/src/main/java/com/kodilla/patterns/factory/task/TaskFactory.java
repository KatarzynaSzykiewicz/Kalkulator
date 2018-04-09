package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Grocery", "Bananas", 4.0, true);
            case PAINTING_TASK:
                return new PaintingTask("Garden house project", "blue", "kitchen's walls", true);
            case DRIVING_TASK:
                return  new DrivingTask("Family trip", "the coast", "bicycles", false);
                default:
                    return null;
        }
    }
}
