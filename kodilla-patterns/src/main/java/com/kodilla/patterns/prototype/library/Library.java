package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends PrototypeLibrary {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();

        for (Book book : books) {
            cloneLibrary.getBooks().add(book);
        }

        return cloneLibrary;
    }

    @Override
    public String toString() {
        String library = "   Library [" + name + "]";
        for(Book book : books) {
            library = library + "\n" + book.toString();
        }

        return library;
    }
}
