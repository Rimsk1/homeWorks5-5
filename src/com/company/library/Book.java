package com.company.library;

import java.util.Arrays;

public class Book {
    private String name;
    private int pages;
    private int years;
    private Author[] authors;

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getYears() {
        return years;
    }

    public Author[] getAuthors() {
        return authors;
    }

    void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("BookName to short or no valid");
        }
        this.name = name;
    }

    void setPages(int pages) {
        if (pages < 50) {
            throw new IllegalArgumentException("pages to short");
        }
        this.pages = pages;
    }


    void setYears(int years) {
        if (years < 18)
            throw new IllegalArgumentException("years to short");
        this.years = years;
    }

    public void setAuthor(Author author) {
        this.authors = new Author[]{author};
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public boolean isSingleAuthor() {
        return this.authors.length == 1;
    }

    public Book() {
        this.authors = new Author[]{};
    }

    @Override
    public String toString() {
        String authorString = isSingleAuthor()?"author ="+this.authors[0]:"authors=" + Arrays.toString(authors);
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", years=" + years +
                ", " + authorString +
                '}';
    }
}


