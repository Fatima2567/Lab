package ru.mirea.gibo_01_18.idrisova.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Nekrasov", "im_dead@mail.ru", 'M');
        System.out.println(a1);
        System.out.println(a1.getEmail());
    }
}
