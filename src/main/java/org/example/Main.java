package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
       logger.info("Hello world!");

       MainLayout mainLayout = new MainLayout();
       mainLayout.setContentPane(mainLayout.getMainPanel());
       mainLayout.setTitle("App");
       mainLayout.setSize(800, 300);
       mainLayout.setVisible(true);
       mainLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}