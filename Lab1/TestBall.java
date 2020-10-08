package ru.mirea.gibo_01_18.idrisova.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 2);
        Ball b2 = new Ball("Blue", 3.14159265);
        Ball b3 = new Ball("Rainbow");
        b3.setDiam(11.11);
        System.out.println(b1);
        System.out.println("V1 = " + b1.calcVolume());
        System.out.println("V2 = " + b2.calcVolume());
        System.out.println("V3 = " + b3.calcVolume());
    }
}