package gui;

import javax.swing.*;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        frame.getContentPane().add(BorderLayout.WEST, button1);
        frame.getContentPane().add(BorderLayout.CENTER ,button2);
        frame.getContentPane().add(BorderLayout.EAST ,button3);

        frame.setVisible(true);
    }
}