package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public class CakesOrderService implements OrderService
{
    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    @Override
    public boolean order(User user, LocalDateTime orderDate, Product product, int quantity)
    {
        System.out.println("User " + user.getNickName() + " " + user.getFirstName() + " " + user.getLastName() +
                " created order for " + orderRequest.getQuantity() + " piece(s) of "  + orderRequest.getProduct().getProductName() +
                " on " + orderRequest.getOrderDate() +"." + "\n" + "Total amount to be paid: " +
                orderRequest.getQuantity() * orderRequest.getProduct().getPrice() + " $");
        return true;
    }
}
