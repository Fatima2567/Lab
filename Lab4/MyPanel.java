package ru.mirea.gibo_01_18.idrisova.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;
    public MyPanel(){
        count = 0;
        push = new JButton("Нажми меня");
        label = new JLabel("Сколько нажатий?" + count);
        push.addActionListener(new ButtonListener());
        add(push);
        add(label);
    setPreferredSize(new Dimension(300,400));
    setBackground(Color.GREEN);
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent  e){
            count++;
            label.setText("Нажатий =" + count);

        }
    }
}
