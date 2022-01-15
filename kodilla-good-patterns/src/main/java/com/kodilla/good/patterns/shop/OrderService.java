package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public interface OrderService
{
    boolean order(User user, LocalDateTime orderDate, Product product, int quantity);
}
