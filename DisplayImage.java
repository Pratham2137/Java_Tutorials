package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayImage extends JFrame implements ActionListener {
    JTextField txtPath;
    JLabel lblPath, lblImage;
    JButton cmdDisplay;
    JScrollPane jsp;
    JPanel topPanel;

    DisplayImage() {
        txtPath = new JTextField(20);
        lblPath = new JLabel("Enter Image Path ");
        cmdDisplay = new JButton("Display");
        cmdDisplay.addActionListener(this);
        lblImage = new JLabel("Image will be displayed here");
        jsp = new JScrollPane(lblImage);
        topPanel = new JPanel();
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        topPanel.add(lblPath);
        topPanel.add(txtPath);
        topPanel.add(cmdDisplay);
        con.add(topPanel, BorderLayout.NORTH);
        con.add(jsp, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {
        String p = txtPath.getText();
        ImageIcon img = new ImageIcon(p);
        lblImage.setText("");
        lblImage.setIcon(img);
    }

    public static void main(String[] args) {
        DisplayImage m1=new DisplayImage();
        m1.setTitle("Display Image");
        m1.setSize(500,600);
        m1.setVisible(true);
        m1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println("Siddesh Singh 100");
    }
}