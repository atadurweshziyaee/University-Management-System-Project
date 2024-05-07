package com.ziyaee.university;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class TeacherLeaveDetail extends JFrame implements ActionListener {

    JButton buttonSearch, buttonCancel, buttonPrint;
    Choice choose;

    JTable table;
    TeacherLeaveDetail(){
        setLayout(null);
        getContentPane().setBackground(new Color(24, 94, 102));

        JLabel labelRollNo = new JLabel("Select Employee Id : ");
        labelRollNo.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelRollNo.setBounds(100,20,200,20);
        labelRollNo.setForeground(Color.white);
        add(labelRollNo);

        choose = new Choice();
        choose.setBounds(300,20,200,20);
        add(choose);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from teacherleave");
            while(resultSet.next()){
                choose.add(resultSet.getString("emp_id"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        buttonSearch = new JButton("Search");
        buttonSearch.setBounds(100,50,100,20);
        buttonSearch.setForeground(Color.white);
        buttonSearch.setBackground(Color.BLACK);
        buttonSearch.addActionListener(this);
        add(buttonSearch);

        buttonPrint = new JButton("Print");
        buttonPrint.setBounds(220,50,100,20);
        buttonPrint.setForeground(Color.white);
        buttonPrint.setBackground(Color.BLACK);
        buttonPrint.addActionListener(this);
        add(buttonPrint);


        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(340,50,100,20);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        table = new JTable();
        table.setBackground(Color.yellow);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from teacherleave");
            while(resultSet.next()){
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);


        setUndecorated(true);
        setSize(900,700);
        setLocation(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonSearch){

            String query = "Select * from teacherleave where emp_id = '"+choose.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == buttonPrint){
            try{
                table.print();
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == buttonCancel){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new TeacherLeaveDetail();
    }
}
