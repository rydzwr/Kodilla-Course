package com.kodilla.good.patterns.food2Door;

public class Application
{
    public static void main(String[] args)
    {
        SupplierManager.getInstance().addSupplier("ExtraFoodShop", new Supplier());
        SupplierManager.getInstance().addSupplier("HealthyShop", new Supplier());
        SupplierManager.getInstance().addSupplier("GlutenFreeShop", new Supplier());

        Order order = new Order();
        order.createOrder("Product10", 10,"GlutenFreeShop");
    }
}
