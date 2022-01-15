package com.kodilla.good.patterns.shop;

public class ProductOrderService
{
    public static void main(String[] args)
    {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(), new CakesOrderService(), new CakesOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
