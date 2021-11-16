package com.kodilla.testing.shape;

public class Square implements Shape
{
    private int a;
    private double field;

    public Square(int a)
    {
        this.a = a;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setField(double field)
    {
        this.field = field;
    }

    @Override
    public void getShapeName()
    {
        System.out.println("Square");
    }

    @Override
    public void getField()
    {
        field += a * a;
        System.out.println(field);
    }
}
