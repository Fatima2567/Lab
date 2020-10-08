package ru.mirea.gibo_01_18.idrisova.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book k1 = new Book("Lord of the Rings", 100);
        Book k2 = new Book("The Witcher", 200000);
        Book k3 = new Book("Harry Potter");
        k3.setPages(1123412);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}