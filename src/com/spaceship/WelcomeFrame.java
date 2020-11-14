package com.spaceship;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends JFrame {
    public WelcomeFrame(){
        this.setVisible(true);
        this.setSize(1200,900);
        this.setLocation(250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("src/com/spaceship/image/xiaoxin.jpg");

        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(255,103,32));

        //ImageIcon bigSurIcon = new ImageIcon("src/com/spaceship/image/bigSur.png");

        JLabel label = new JLabel();
        label.setIcon(imageIcon);
        label.setText("Welcome to Mac Big Sur");
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.TOP);

        this.add(label);


    }
}
