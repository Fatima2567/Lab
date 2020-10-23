package ru.mirea.gibo_01_18.idrisova.lab2;

public class Author {
    private String name; // (типа String)
    private String email; // (типа String)
    private char gender; // (типа char)

    public Author() {}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}