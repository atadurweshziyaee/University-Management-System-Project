package com.ziyaee.university;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentLeave extends JFrame implements ActionListener {

    Choice choose, chooseTime;
    JButton buttonSubmit, buttonCancel;
    JTextField textReason;
    JDateChooser dateChooser, dateChooser2;
    StudentLeave(){
        setLayout(null);
        getContentPane().setBackground(new Color(70, 225, 242));


        JLabel labelHeading = new JLabel("Apply Student Leave");
        labelHeading.setBounds(40, 50, 300, 30);
        labelHeading.setFont(new Font("raleway", Font.BOLD, 20));
        add(labelHeading);

        JLabel labelRollNo = new JLabel("Select Roll No : ");
        labelRollNo.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelRollNo.setBounds(40, 80, 200, 30);
        add(labelRollNo);


        choose = new Choice();
        choose.setBounds(250,85,150,20);
        add(choose);


        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from student");
            while(resultSet.next()){
                choose.add(resultSet.getString("roll_no"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JLabel labelFromDate = new JLabel("From Date : ");
        labelFromDate.setBounds(40, 120, 150, 30);
        labelFromDate.setFont(new Font("raleway", Font.PLAIN, 20));
        add(labelFromDate);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(250,120,120,20);
        add(dateChooser);

        JLabel labelToDate = new JLabel("To Date : ");
        labelToDate.setBounds(40,160,150,30);
        labelToDate.setFont(new Font("raleway", Font.PLAIN, 20));
        add(labelToDate);

        dateChooser2 = new JDateChooser();
        dateChooser2.setBounds(250,160,100,20);
        add(dateChooser2);

        JLabel labelTime = new JLabel("Day : ");
        labelTime.setBounds(40, 200, 100, 30);
        labelTime.setFont(new Font("raleway", Font.PLAIN, 20));
        add(labelTime);

        chooseTime = new Choice();
        chooseTime.setBounds(250,200,120,20);
        chooseTime.add("Full Day");
        chooseTime.add("Half Day");
        add(chooseTime);

        JLabel labelReason = new JLabel("Reason : ");
        labelReason.setBounds(40,240,150,20);
        labelReason.setFont(new Font("raleway", Font.PLAIN, 20));
        add(labelReason);

        textReason = new JTextField();
        textReason.setBounds(250, 240, 150, 20);
        textReason.setFont(new Font("raleway", Font.PLAIN, 20));
        add(textReason);



        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(50,300,100,25);
        buttonSubmit.setFont(new Font("Raleway",Font.PLAIN,16));
        buttonSubmit.setForeground(Color.WHITE);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(250,300,100,25);
        buttonCancel.setFont(new Font("Raleway",Font.PLAIN,16));
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.addActionListener(this);
        add(buttonCancel);





        setUndecorated(true);
        setSize(500,550);
        setLocation(550,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == buttonSubmit){

            try{
                String rollNo = choose.getSelectedItem();
                String fromDate = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
                String toDate = ((JTextField)dateChooser2.getDateEditor().getUiComponent()).getText();
                String day = chooseTime.getSelectedItem();
                String reason = textReason.getText();

                Conn c = new Conn();
                String query = "insert into studentleave values('"+rollNo+"', '"+fromDate+"', '"+toDate+"', '"+day+"', '"+reason+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Leave applied successfully");
                setVisible(false);
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == buttonCancel){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentLeave();
    }
}
