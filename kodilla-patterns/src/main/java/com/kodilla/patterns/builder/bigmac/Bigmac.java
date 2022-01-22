package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class Bigmac {
    private String bun;
    private int burgersQuantity;
    private String sauceType;
    private ArrayList<String> ingredients = new ArrayList();

    public static class BigmacBulider {
        private String bun;
        private int burgersQuantity;
        private String sauceType;
        private ArrayList ingredients = new ArrayList();

        public BigmacBulider bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBulider burgersQuantity(int burgersQuantity) {
            this.burgersQuantity = burgersQuantity;
            return this;
        }

        public BigmacBulider sauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public BigmacBulider ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgersQuantity, sauceType, ingredients);
        }
    }

    public Bigmac(String bun, int burgersQuantity, String sauceType, ArrayList<String> ingredients) {
        this.bun = bun;
        this.burgersQuantity = burgersQuantity;
        this.sauceType = sauceType;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgersQuantity() {
        return burgersQuantity;
    }

    public String getSauceType() {
        return sauceType;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgersQuantity=" + burgersQuantity +
                ", sauceType='" + sauceType + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
