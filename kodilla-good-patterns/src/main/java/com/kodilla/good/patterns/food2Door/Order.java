package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    public void createOrder(String productName, int quantity, String supplierName) {
        ArrayList<Product> supplierProducts = SupplierManager.getInstance().getSupplier(supplierName).getProductsList();

        supplierProducts.stream()
                .filter(product -> product.getProductName().equals(productName))
                .collect(Collectors.toList());


        boolean s = supplierProducts.stream()
                .anyMatch(product -> product.getProductName().equals(productName));

        if (s)
            SupplierManager.getInstance().getSupplier(supplierName).process();
        else {
            System.out.println("Cannot Find That Product In " + supplierName + "'s Warehouse!");
            System.out.println("Please Choose Another Product");
        }
    }
}
