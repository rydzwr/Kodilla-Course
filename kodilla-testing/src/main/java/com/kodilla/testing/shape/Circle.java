package com.kodilla.testing.shape;

public class Circle implements Shape
{
    private int r;
    private double field;

    public Circle(int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public void setField(double field)
    {
        this.field = field;
    }

    @Override
    public void getShapeName()
    {
        System.out.println("Circle");
    }

    @Override
    public void getField()
    {
        field += 3.14 * (r * r);
        System.out.println(field);
    }
}
