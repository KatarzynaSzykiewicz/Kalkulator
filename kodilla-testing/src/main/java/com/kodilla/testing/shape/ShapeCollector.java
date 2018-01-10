package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figuresList = new ArrayList<Shape>();


    public void addFigure(Shape shape){
        figuresList.add(shape);
    }

    public boolean removeFigure(String shapeName){
        return true;
    }

    public String getFigure(int figureNumber){
        return null;
    }

    public ArrayList<Shape> getFiguresList() {
        return figuresList;
    }
}


