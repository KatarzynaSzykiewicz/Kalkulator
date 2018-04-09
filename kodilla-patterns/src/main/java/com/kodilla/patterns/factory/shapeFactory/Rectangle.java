package com.kodilla.patterns.factory.shapeFactory;

public final class Rectangle implements Shape{
    final String name;
    final double width;
    final double length;

    public Rectangle(final String name, final double radius, double length) {
        this.name = name;
        this.width = radius;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return width * length;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }
}
