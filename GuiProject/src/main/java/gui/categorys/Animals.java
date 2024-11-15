package gui.categorys;

import javax.swing.*;

public class Animals {

    public Animals(){

        JFrame frame = new JFrame("Animals");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JLabel label = new JLabel("We got 10 quiz questions for your", SwingConstants.CENTER);

        frame.add(label);
        frame.setVisible(true);

    }
}
