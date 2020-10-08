package ru.mirea.gibo_01_18.idrisova.lab1;

public class Book {
    private String name;
    private int pages;

    public Book(String n, int p) {
        name = n;
        pages = p;
    }

    public Book(String n) {
        name = n;
        pages = 0;
    }

    public Book() {
        name = "Unknown";
        pages = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName(String name) {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "Book's name is " + this.name + " with " + this.pages + " pages";
    }
}