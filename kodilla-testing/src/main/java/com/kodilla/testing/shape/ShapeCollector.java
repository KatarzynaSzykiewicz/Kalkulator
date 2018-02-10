package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {

    private ArrayList<Shape> figuresList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(figuresList, that.figuresList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(figuresList);
    }

    public int getFiguresListSize() {
        return figuresList.size();
    }

    public void addFigure(Shape shape) {
        figuresList.add(shape);
    }

    public void removeFigure(Shape shape) {
        figuresList.remove(shape);
    }

    public Shape getFigure(int shapeNumber) {
        Shape theShape = null;
        if (shapeNumber >= 0 && shapeNumber < figuresList.size()) {
            theShape = figuresList.get(shapeNumber);
        }
        return theShape;
    }

    public void showFigures() {
        for (Shape figure : figuresList) {
            System.out.println("The figure in the list is: " + figure);
        }
    }
}


