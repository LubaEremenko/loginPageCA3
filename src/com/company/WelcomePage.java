package com.company;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String id) {

        welcomeLabel.setBounds(0,0, 200,35);
        welcomeLabel.setFont(new Font(null, Font.BOLD,35));
        welcomeLabel.setText("Welcome to our College " + id + " !");


        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,700);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
