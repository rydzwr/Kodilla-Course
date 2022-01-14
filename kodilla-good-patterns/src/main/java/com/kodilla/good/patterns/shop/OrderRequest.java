package com.kodilla.good.patterns.shop;

import java.time.LocalDate;

public class OrderRequest
{
    private User user;
    private Product product;
    private int quantity;
    private double totalPrice;
    private boolean paymentFailed;
    LocalDate orderDate;


    public OrderRequest(User user, Product product, int quantity, double totalPrice, LocalDate orderDate)
    {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    public void checkPayment(boolean paymentFailed)
    {
        if (paymentFailed == true)
            System.out.println("Payment Failed!");

        else
            System.out.println("Transaction Successful!");
    }
}
