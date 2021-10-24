package io.github.mbfjllybl;

import java.util.List;

public class BookStore {
    public List<String> books;

    public BookStore(List<String> books) {
        this.books = books;
    }

    public BookStore() {
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
