package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public final Task makeTask (final String taskClass){
        return switch (taskClass){
            case PAINTING -> new PaintingTask("Painting task", "red","wall");
            case SHOPPING -> new ShoppingTask("Shopping task", "Chleb", 2.0);
            case DRIVING -> new DrivingTask("Driving task", "Warsaw", "Car");
            default -> null;
        };
    }
}
