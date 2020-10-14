package com.bornander.imagetest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private JMenuBar menuBar = new JMenuBar();
    private JPanel mainPanel = new JPanel();

    public MainWindow(String filename) throws IOException {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(menuBar, BorderLayout.NORTH);
        contentPane.add(mainPanel, BorderLayout.CENTER);

        //menuBar.setBackground(Color.RED);
        //menuBar.add(new JButton("Foo"));
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setLayout(new BorderLayout());

        JLabel picLabel = new JLabel(new ImageIcon(ImageIO.read(new File(filename))));
        mainPanel.add(picLabel, BorderLayout.CENTER);

        setSize(1920, 1080);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


