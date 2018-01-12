package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "This is a circle.";
    }

    @Override
    public Double getField() {
        return 3.14 * radius * radius;
    }
}
