package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    JPanel contentPanel;
    JButton button1;
    JButton button2;
    JButton button3;
    JFrame frame = new JFrame();
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        JButton button1 = new JButton("Quiz");
        JButton button2 = new JButton("HighScore");
        JButton button3 = new JButton("Exit");

        this.getContentPane().add(BorderLayout.WEST, button1);
        this.getContentPane().add(BorderLayout.CENTER ,button2);
        this.getContentPane().add(BorderLayout.EAST ,button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == button1){
                        frame.dispose();

                        new QuizMenu();
                    }

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button2){
                    frame.dispose();
                    new HighScoreMenu();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button3){
                    System.exit(0);

                }
            }
        });

        this.setVisible(true);

    }

}
