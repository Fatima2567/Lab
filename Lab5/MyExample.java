package ru.mirea.gibo_01_18.idrisova.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyExample extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,14);
    JButton button = new JButton("Добавить надпись");


    MyExample(){
        super("Мое второе окно!");
        setSize(200,300);
        setLayout(new FlowLayout());
        add(jta);
        add(button);
        button.addActionListener(new MyEx());

    }
    private class MyEx implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = JOptionPane.showInputDialog(MyExample.this,"В целях безопасности напишите текст! " + jta.getText());

        }
    }
}
