package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalculator extends JFrame implements ActionListener 
{
    JTextField txtfirstno, txtsecondno, txtanswer;
    JButton add, sub, mul, div;
    JLabel lblfirstno, lblsecondno, lblanswer;

    MyCalculator()
    {
        txtfirstno = new JTextField(20);
        txtsecondno = new JTextField(20);
        txtanswer = new JTextField(20);
        txtanswer.setEnabled(false);
        add = new JButton("Add");
        add.addActionListener(this);
        sub = new JButton("Sub");
        sub.addActionListener(this);
        mul = new JButton("Mul");
        mul.addActionListener(this);
        div = new JButton("Div");
        div.addActionListener(this);
        lblfirstno = new JLabel("First No");
        lblsecondno = new JLabel("Second No");
        lblanswer = new JLabel("Answer");
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(lblfirstno);
        con.add(txtfirstno);
        con.add(lblsecondno);
        con.add(txtsecondno);
        con.add(lblanswer);
        con.add(txtanswer);
        con.add(add);
        con.add(sub);
        con.add(mul);
        con.add(div);
    }

    public void actionPerformed(ActionEvent ae) {
        int no1 = Integer.parseInt(txtfirstno.getText());
        int no2 = Integer.parseInt(txtsecondno.getText());
        if (ae.getSource() == add) txtanswer.setText("" + (no1 + no2));
        if (ae.getSource() == sub) txtanswer.setText("" + (no1 - no2));
        if (ae.getSource() == mul) txtanswer.setText("" + (no1 * no2));
        if (ae.getSource() == div) txtanswer.setText("" + (no1 / no2));
    }

    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        mc.setTitle("Display Calulator");
        mc.setSize(280, 280);
        mc.setVisible(true);
        mc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}