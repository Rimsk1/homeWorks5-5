package com.company.library;

import java.util.Arrays;
import java.util.Objects;

public class Library {

    private int number;
    private Book[] books;

    public void setNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Номер хранилища не может быть 0");
        }
        this.number = number;
    }

    public void addBooks(Book book) {
        Objects.requireNonNull(book, "book не может быть null");
        for (int i = 0; i < 20; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            } else {
                if (book.getName().equalsIgnoreCase(books[i].getName())) {
                    System.out.println("Такая книга уже есть, выберите другое хранилище");
                    return;
                }
            }
        }
        System.out.println("Хранилище заполнено, выберите другое");
    }
    public Library() {
        this.books = new Book[20];
    }

    @Override
    public String toString() {
        return "Library{" +
                "book='" + Arrays.toString(books) + '\'' +
                ", number=" + number +
                '}';

    }
}
