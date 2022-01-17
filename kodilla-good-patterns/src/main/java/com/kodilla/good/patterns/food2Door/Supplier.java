package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.Random;

public class Supplier implements Process
{
    private ArrayList<Product> productsList = new ArrayList<>();

    public Supplier()
    {
        this.productsList = getProductsList();
    }

    public ArrayList<Product> getProductsList()
    {
        generateRandomProducts();
        return productsList;
    }

    @Override
    public void process()
    {
        System.out.println("Your Order Has Been Successfully Created!");
    }

    private void generateRandomProducts()
    {
        Random random = new Random();

        int randomProductsCount = random.nextInt(100) + 40;

        for (int i = 0; i < randomProductsCount; i++)
        {
            String productName = "Product" + i;
            double productPrice = random.nextInt(100) + 10;
            Product product = new Product(productName, productPrice);

            productsList.add(product);
        }
    }
}
