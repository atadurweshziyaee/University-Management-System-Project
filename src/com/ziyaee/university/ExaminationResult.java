package com.ziyaee.university;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class ExaminationResult extends JFrame implements ActionListener {

    JTextField textSearch;
    JTable table;
    JButton buttonSearch, buttonCancel;
    ExaminationResult(){

        getContentPane().setBackground(new Color(24, 94, 102));
        setLayout(null);


        JLabel labelheading = new JLabel("Check Result");
        labelheading.setBounds(100,10,150,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 20));
        labelheading.setForeground(Color.white);
        add(labelheading);

        textSearch = new JTextField();
        textSearch.setBounds(250,15,150,20);
        textSearch.setFont(new Font("Raleway", Font.PLAIN,16));
        add(textSearch);

        buttonSearch = new JButton("Search");
        buttonSearch.setBounds(120, 50, 100, 25);
        buttonSearch.setBackground(Color.BLACK);
        buttonSearch.setForeground(Color.white);
        buttonSearch.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonSearch.addActionListener(this);
        add(buttonSearch);


        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(240, 50, 100, 25);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonCancel.addActionListener(this);
        add(buttonCancel);




        table = new JTable();
        table.setBackground(Color.yellow);


        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,1000,600);
        add(jsp);



        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                textSearch.setText(table.getModel().getValueAt(row,2).toString());
            }
        });


        setUndecorated(true);
        setSize(1000, 600);
        setLocation(250,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            String roll = textSearch.getText();
            if(e.getSource() == buttonSearch){
                setVisible(false);
                new ShowResult(roll);
            }
            else if(e.getSource() == buttonCancel){
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExaminationResult();
    }
}
