package com.kodilla.testing.shape;

public class Triangle implements Shape
{
    private int a;
    private int h;
    private double field;

    public Triangle(int a, int h)
    {
        this.a = a;
        this.h = h;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getH()
    {
        return h;
    }

    public void setH(int h)
    {
        this.h = h;
    }

    public void setField(double field)
    {
        this.field = field;
    }

    @Override
    public void getShapeName()
    {
        System.out.println("Triangle");
    }

    @Override
    public void getField()
    {
        field += (a * h) / 2;
        System.out.println(field);
    }
}
