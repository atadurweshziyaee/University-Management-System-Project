package com.ziyaee.university;

import com.toedter.calendar.JDateChooser;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class StudentFeeForm extends JFrame implements ActionListener {
    Choice choose;
    JButton buttonCancel, buttonUpdate, buttonPay;
    JDateChooser dateChooser;
    JLabel labelName2, labelFName2, labelTotal2;
    JComboBox chooseCourse, chooseSem, chooseBranch;
    StudentFeeForm(){

        getContentPane().setBackground(new Color(70, 225, 242));

        JLabel labelheading = new JLabel("Student Fee Payment Form ");
        labelheading.setBounds(300,10,300,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelheading);

        JLabel labelRollNo = new JLabel("Select Roll No : ");
        labelRollNo.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelRollNo.setBounds(100,60,200,20);
        add(labelRollNo);

        choose = new Choice();
        choose.setBounds(300,60,200,20);
        add(choose);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from student");
            while(resultSet.next()){
                choose.add(resultSet.getString("roll_no"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(100,90,150,30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelName);

        labelName2 = new JLabel();
        labelName2.setBounds(200,90,150,25);
        labelName2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelName2);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setBounds(450,90,150,30);
        labelFName.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelFName);

        labelFName2 = new JLabel();
        labelFName2.setBounds(580,90,150,25);
        labelFName2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelFName2);

        JLabel labelCourse = new JLabel("Course : ");
        labelCourse.setBounds(100,130,150,30);
        labelCourse.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelCourse);

        String course[] = {"BTech", "BBA", "BCA", "Bsc", "B.com", "BA", "Msc", "M.tech", "MBA", "MCA", "MCom", "MA"};
        chooseCourse = new JComboBox(course);
        chooseCourse.setBounds(200,130,150,25);
        chooseCourse.setFont(new Font("Raleway",Font.BOLD,14));
        add(chooseCourse);

        JLabel labelChooseSem = new JLabel("Semester : ");
        labelChooseSem.setBounds(450,130,100,25);
        labelChooseSem.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelChooseSem);

        String sem[] = {"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"};
        chooseSem = new JComboBox(sem);
        chooseSem.setBounds(550, 130, 100, 25);
        chooseSem.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(chooseSem);

        JLabel labelBranch = new JLabel("Branch : ");
        labelBranch.setBounds(100,170,300,25);
        labelBranch.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelBranch);

        String branch[] = {"CSE(DS)", "CSE", "Artificial Intelligence", "ECE", "EE", "Mechanical", "Civil", "IT", };
        chooseBranch = new JComboBox(branch);
        chooseBranch.setBounds(200,170,200,25);
        chooseBranch.setFont(new Font("Raleway",Font.BOLD,16));
        add(chooseBranch);

        JLabel labelDate = new JLabel("Date : ");
        labelDate.setBounds(450,170,100,25);
        labelDate.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelDate);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(550,170,200,25);
        dateChooser.setFont(new Font("Raleway",Font.PLAIN,16));
        add(dateChooser);

        JLabel labelTotal = new JLabel("Total Payable : ");
        labelTotal.setBounds(100,210,150,25);
        labelTotal.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelTotal);

        labelTotal2 = new JLabel();
        labelTotal2.setBounds(230,210,200,25);
        labelTotal2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelTotal2);



        try{
            Conn c = new Conn();
            String query = "Select * from student where roll_no = '"+choose.getSelectedItem()+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()){
                labelName2.setText(resultSet.getString("name"));
                labelFName2.setText(resultSet.getString("father_name"));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        choose.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    Conn c = new Conn();
                    String query = "select * from student where roll_no = '"+choose.getSelectedItem()+"'";
                    ResultSet resultSet = c.statement.executeQuery(query);
                    while(resultSet.next()){

                        labelName2.setText((resultSet.getString("name")));
                        labelFName2.setText(resultSet.getString("father_name"));
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        buttonUpdate = new JButton("Fetch");
        buttonUpdate.setBounds(100,300,150,25);
        buttonUpdate.setForeground(Color.white);
        buttonUpdate.setBackground(Color.BLACK);
        buttonUpdate.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonUpdate.addActionListener(this);
        add(buttonUpdate);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(300, 300, 150, 25);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        buttonPay = new JButton("Pay");
        buttonPay.setBounds(500, 300, 150, 25);
        buttonPay.setBackground(Color.BLACK);
        buttonPay.setForeground(Color.white);
        buttonPay.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonPay.addActionListener(this);
        add(buttonPay);

        setLayout(null);
        setUndecorated(true);
        setSize(900,700);
        setLocation(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == buttonCancel){
                setVisible(false);
            }
            else if(e.getSource() == buttonUpdate){
                String course = (String) chooseCourse.getSelectedItem();
                String semester = (String) chooseSem.getSelectedItem();
                try{
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("Select * from fee where course = '"+course+"' ");
                    while(resultSet.next()){
                        labelTotal2.setText(resultSet.getString(semester));
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
            else if(e.getSource() == buttonPay){

                String roll = choose.getSelectedItem();
                String course = (String) chooseCourse.getSelectedItem();
                String branch = (String) chooseBranch.getSelectedItem();
                String date = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                String semester = (String) chooseSem.getSelectedItem();
                String fees = labelTotal2.getText();

                try{
                    Conn c = new Conn();
                    String query = "insert into collegefee values ('" + roll + "', '" + course + "', '" + branch + "', '"+date+"', '" + semester + "', '" + fees + "')";
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Fees Payment successfully");
                }
                catch (Exception E){
                    E.printStackTrace();
                }
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentFeeForm();
    }
}
