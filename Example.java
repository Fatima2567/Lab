package ru.mirea.gibo_01_18.idrisova.lab4;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel my = new MyPanel();
        frame.getContentPane().add(my);
        frame.setPreferredSize(new Dimension(200,300));
        frame.pack();
        frame.setVisible(true);


    }
}