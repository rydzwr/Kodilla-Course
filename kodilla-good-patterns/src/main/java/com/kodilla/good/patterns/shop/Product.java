package com.kodilla.good.patterns.shop;

import java.util.Random;

public class Product
{
    private int productID;
    private double price;

    public Product(int productID, double price)
    {
        this.productID = productID;
        this.price = price;
    }

    public int getProductID()
    {
        return productID;
    }

    public double getPrice()
    {
        return price;
    }

    public boolean checkPayment()
    {
        Random random = new Random();
        return random.nextBoolean();
    }
}
