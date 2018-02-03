package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "This is a square";
    }

    @Override
    public Double getField() {
        return side * side;
    }
}
