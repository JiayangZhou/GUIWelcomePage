package com.spaceship;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends JFrame {
    public WelcomeFrame(){
        this.setVisible(true);
        this.setSize(430,430);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("/Users/jiayangzhou/Tea/Photos/Logo/xiaoxin.jpg");
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(255,103,32));

        JLabel label = new JLabel();
    }
}
