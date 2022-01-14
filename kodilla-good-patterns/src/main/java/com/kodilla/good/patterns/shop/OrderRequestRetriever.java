package com.kodilla.good.patterns.shop;

import java.time.LocalDate;

public class OrderRequestRetriever
{
    public void retrieve()
    {
        User user = new User(2137, "PauloSecundo", "paulo.secundo@wp.pl");
        LocalDate orderDate = LocalDate.now();
        Product product = new Product(1337, 20);
        int quantity = 20;

        double totalPrice = quantity * product.getPrice();

        OrderRequest orderRequest = new OrderRequest(user, product, quantity, totalPrice, orderDate);

        if (product.checkPayment())
        {
            orderRequest.checkPayment(false);
        }

        else
            orderRequest.checkPayment(true);
    }

}
