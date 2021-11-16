package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector
{
    ArrayList<Shape> shapes = new ArrayList<>();


    void addFigure(Shape shape)
    {
        shapes.add(shape);
    }

    void removeFigure(Shape shape)
    {
        shapes.remove(shape);
    }

    Object getFigure(int n)
    {
        return shapes.get(n);
    }

    String showFigures()
    {
        String shapesList = "";
        for (Shape s : shapes)
        {
            shapesList += s + " ";
        }

        return shapesList;
    }
}
