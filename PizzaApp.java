package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaApp extends JFrame {
    JLabel lblname, lblmobileno, lblcrust, lbldelivery, lbltoppings;
    JTextField txtname, txtmobileno;
    JRadioButton optthin, optthick;
    JComboBox cmddelivery;
    JCheckBox chkolives, chkonion, chkcapscicum, chkchicken, chkpaneer;
    JPanel p1, p2, p3, p4, p5;

    PizzaApp() {
        lblname = new JLabel("Name");
        txtname = new JTextField(20);
        lblmobileno = new JLabel("Mobile Number");
        txtmobileno = new JTextField(20);
        lblcrust = new JLabel("Crust Type");
        optthin = new JRadioButton("Thin");
        optthick = new JRadioButton("Thick");
        lbldelivery = new JLabel("Delivery Type");
        cmddelivery = new JComboBox();
        cmddelivery.addItem("Eat In");
        cmddelivery.addItem("Take Away");
        lbltoppings = new JLabel("Toppings");
        chkolives = new JCheckBox("0lives");
        chkcapscicum = new JCheckBox("Capsicum");
        chkchicken = new JCheckBox("Chicken");
        chkonion = new JCheckBox("Onion");
        chkpaneer = new JCheckBox("Paneer");
        p2 = new JPanel(new FlowLayout());
        p4 = new JPanel(new FlowLayout());
        p1 = new JPanel(new FlowLayout());
        p3 = new JPanel(new FlowLayout());
        p5 = new JPanel(new FlowLayout());
        Container con = getContentPane();
        con.setLayout(new GridLayout(5,1));
        con.add(p1);
        con.add(p2);
        con.add(p3);
        con.add(p4);
        con.add(p5);
        p1.add(lblname);
        p1.add(txtname);
        p2.add(lblmobileno);
        p2.add(txtmobileno);
        p3.add(lblcrust);
        p3.add(optthin);
        p3.add(optthick);
        p4.add(lbldelivery);
        p4.add(cmddelivery);
        p5.add(lbltoppings);
        p5.add(chkolives);
        p5.add(chkonion);
        p5.add(chkcapscicum);
        p5.add(chkpaneer);
        p5.add(chkchicken);

    }

    public static void main(String[] args) {
        PizzaApp mc = new PizzaApp();
        mc.setTitle("PIZZA APPLICATION");
        mc.setSize(400, 280);
        mc.setVisible(true);
        mc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
