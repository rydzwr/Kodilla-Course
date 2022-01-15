package com.kodilla.good.patterns.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest
{
    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;

    public OrderRequest(User user, LocalDateTime orderDate, Product product, int quantity)
    {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser()
    {
        return user;
    }

    public LocalDateTime getOrderDate()
    {
        return orderDate;
    }

    public Product getProduct()
    {
        return product;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
