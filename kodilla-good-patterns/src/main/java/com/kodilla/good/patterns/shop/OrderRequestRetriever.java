package com.kodilla.good.patterns.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever
{
    public OrderRequest retrieve()
    {
        User user = new User("John", "Paulo", "Secundo");
        LocalDateTime dateOfOrder = LocalDateTime.of(2005, 04, 02, 21, 37);
        Product product = new Product("Fondant", 4.0);
        int quantity = 8;

        return new OrderRequest(user, dateOfOrder, product, quantity);
    }
}
