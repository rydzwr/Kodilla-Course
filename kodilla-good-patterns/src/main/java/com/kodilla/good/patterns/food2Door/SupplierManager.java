package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class SupplierManager {
    private static SupplierManager instance;

    private HashMap<String, Supplier> suppliersList;

    public SupplierManager() {
        this.suppliersList = new HashMap<String, Supplier>();
    }

    public void addSupplier(String supplierName, Supplier supplier) {
        suppliersList.put(supplierName, supplier);
    }

    public Supplier getSupplier(String  supplierName) {
        return suppliersList.get(supplierName);
    }

    public static SupplierManager getInstance() {
        if (instance == null)
            instance = new SupplierManager();

        return instance;
    }
}
