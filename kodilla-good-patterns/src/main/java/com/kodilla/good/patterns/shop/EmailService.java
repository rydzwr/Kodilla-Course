package com.kodilla.good.patterns.shop;

public class EmailService implements InformationService
{
    @Override
    public void inform(User user)
    {
        System.out.println("Your order has been placed.");
    }
}
