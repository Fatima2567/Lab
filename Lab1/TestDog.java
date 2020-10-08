package ru.mirea.gibo_01_18.idrisova.lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Ruzvelt", 3);
        Dog d2 = new Dog("Linkoln", 17);
        Dog d3 = new Dog("Washington");
        d3.setAge(11);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}