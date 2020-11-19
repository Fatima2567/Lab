package ru.mirea.gibo_01_18.idrisova.lab5;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel p = new Panel();
        frame.getContentPane().add(p);
        frame.setPreferredSize(new Dimension(200,300));
        frame.pack();
        frame.setVisible(true);

        new MyExample().setVisible(true);

        }
    }
