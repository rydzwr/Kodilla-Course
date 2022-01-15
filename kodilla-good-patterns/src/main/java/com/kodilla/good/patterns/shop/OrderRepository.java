package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public interface OrderRepository
{
    boolean createOrder(User user, LocalDateTime orderDate);
}
