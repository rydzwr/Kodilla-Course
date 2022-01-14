package com.kodilla.good.patterns.shop;

public class OrderProcessor
{
    private OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

    public void processOrder()
    {
        orderRequestRetriever.retrieve();
    }
}
