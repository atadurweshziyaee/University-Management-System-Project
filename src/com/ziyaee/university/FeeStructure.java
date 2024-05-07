package com.ziyaee.university;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FeeStructure extends JFrame implements ActionListener {
    JButton buttonCancel;
    FeeStructure(){
        getContentPane().setBackground(new Color(24, 94, 102));

        JLabel labelheading = new JLabel("Fee Structure ");
        labelheading.setBounds(100,10,150,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 20));
        labelheading.setForeground(Color.white);
        add(labelheading);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(580,50,100,20);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        JTable table = new JTable();
        table.setBackground(Color.yellow);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1000, 700);
        add(jsp);



        setLayout(null);
        setUndecorated(true);
        setSize(1000,700);
        setLocation(250,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == buttonCancel){
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new FeeStructure();
    }
}
