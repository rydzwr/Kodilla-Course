package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given

        Random random = new Random();
        Library library = new Library("Test Library");

        for (int i = 0; i < 10; i++) {
            int randomDayOfTheMonth = random.nextInt(31) + 1;
            library.getBooks().add(new Book("Book " + i, "Author " + i * 21, LocalDate.of(2022, i + 1, randomDayOfTheMonth)));
        }

        //When

        Library shallowClone = library.shallowCopy();
        shallowClone.setName("Shallow Library");

        Library deepClone = library.deepCopy();
        deepClone.setName("Deep Library");

        //Then

        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);

        Assertions.assertEquals(10, library.getBooks().size());
        Assertions.assertEquals(10, shallowClone.getBooks().size());
        Assertions.assertEquals(10, deepClone.getBooks().size());
    }
}
