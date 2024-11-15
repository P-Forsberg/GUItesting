package gui;

import gui.categorys.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizMenu implements ActionListener {

    JButton buttonSport;
    JButton buttonTech;
    JButton buttonGeo;
    JButton buttonAni;
    JButton buttonMusic;
    JFrame frame = new JFrame();

    public QuizMenu(){

        JFrame frame = new JFrame("Quiz Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,1, 10,10));

        JLabel label = new JLabel("Choose a category", SwingConstants.CENTER);

        JButton buttonSport = new JButton("Sport");
        JButton buttonTech = new JButton("Tech");
        JButton buttonGeo = new JButton("Geography");
        JButton buttonAni = new JButton("Animals");
        JButton buttonMusic = new JButton("Music");

        frame.getContentPane().add(BorderLayout.EAST, buttonAni);
        frame.getContentPane().add(BorderLayout.CENTER, buttonTech);

        panel.add(label);
        panel.add(buttonSport);
        panel.add(buttonAni);
        panel.add(buttonTech);
        panel.add(buttonGeo);
        panel.add(buttonMusic);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonTech){
            frame.dispose();
            new Animals();
        }
        if(e.getSource() == buttonTech){
            frame.dispose();
            new Geography();
        }
        if(e.getSource() == buttonTech){
            frame.dispose();
            new Music();
        }
        if(e.getSource() == buttonTech){
            frame.dispose();
            new Sports();
        }
        if(e.getSource() == buttonTech){
            frame.dispose();
            new Tech();
        }
    }
}
