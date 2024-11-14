package gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        JButton button1 = new JButton("Quiz");
        JButton button2 = new JButton("HighScore");
        JButton button3 = new JButton("Exit");

        this.getContentPane().add(BorderLayout.WEST, button1);
        this.getContentPane().add(BorderLayout.CENTER ,button2);
        this.getContentPane().add(BorderLayout.EAST ,button3);

        this.setVisible(true);
    }
}
