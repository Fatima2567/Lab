package ru.mirea.gibo_01_18.idrisova.lab1;

public class Ball {
    private String color;
    private double diam;

    public Ball(String c, double d) {
        color = c;
        diam = d;
    }

    public Ball(String c) {
        color = c;
        diam = 0;
    }

    public Ball() {
        color = "Unknown";
        diam = 0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }

    public String getColor(String color) {
        return color;
    }

    public double getDiam() {
        return diam;
    }

    public String toString() {
        return "Ball's color is " + this.color + ", diameter = " + this.diam;
    }

    public double calcVolume() {
        return 4.0 / 3.0 * Math.PI * (diam / 2) * (diam / 2) * (diam / 2);
    }
}