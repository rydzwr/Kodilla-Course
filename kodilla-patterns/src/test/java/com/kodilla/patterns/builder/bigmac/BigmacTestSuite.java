package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        // Given

        Bigmac bigmac = new Bigmac.BigmacBulider()
                .ingredient("Onion")
                .ingredient("Salad")
                .ingredient("Tomato")
                .ingredient("Cheese")
                .bun("Classic")
                .burgersQuantity(2)
                .sauceType("Garlic Mayo")
                .build();

        System.out.println(bigmac);

        // When

        int howManyIngredients = bigmac.getIngredients().size();

        // Then

        Assertions.assertEquals(4, howManyIngredients);
    }
}
