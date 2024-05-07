package com.ziyaee.university;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ShowResult extends JFrame implements ActionListener {
    String rollNo;
    JButton buttonBack;
    ShowResult(String roll){
        getContentPane().setBackground(new Color(70, 225, 242));
        this.rollNo = roll;
        setLayout(null);

        JLabel labelheading = new JLabel("Ata Durwesh Ziyaee University");
        labelheading.setBounds(225,10,600,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelheading);

        JLabel labelSubHeading = new JLabel("Result Of Examination 2024");
        labelSubHeading.setBounds(225,30,320,25);
        labelSubHeading.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(labelSubHeading);

        JLabel labelRollNo = new JLabel("Roll No : ");
        labelRollNo.setBounds(100,80,100,20);
        labelRollNo.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelRollNo);

        JLabel labelRollNo2 = new JLabel(""+rollNo);
        labelRollNo2.setBounds(200,80,100,20);
        labelRollNo2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelRollNo2);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(350,80,100,20);
        labelName.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelName);

        JLabel labelName2 = new JLabel();
        labelName2.setBounds(450,80,300,20);
        labelName2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelName2);

        JLabel labelSub1 = new JLabel("Subject 1 : ");
        labelSub1.setBounds(100, 170, 120, 30);
        labelSub1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub1);

        JLabel labelSub2 = new JLabel("Subject 2 : ");
        labelSub2.setBounds(100, 200, 120, 30);
        labelSub2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub2);

        JLabel labelSub3 = new JLabel("Subject 3 : ");
        labelSub3.setBounds(100, 230, 120, 30);
        labelSub3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub3);

        JLabel labelSub4 = new JLabel("Subject 4 : ");
        labelSub4.setBounds(100, 260, 120, 30);
        labelSub4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub4);

        JLabel labelSub5 = new JLabel("Subject 5 : ");
        labelSub5.setBounds(100, 290, 120, 30);
        labelSub5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub5);

        JLabel labelSub6 = new JLabel("Subject 6 : ");
        labelSub6.setBounds(100, 320, 120, 30);
        labelSub6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub6);

        JLabel labelSubName1 = new JLabel();
        labelSubName1.setBounds(200, 170, 120, 30);
        labelSubName1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName1);

        JLabel labelSubName2 = new JLabel();
        labelSubName2.setBounds(200, 200, 120, 30);
        labelSubName2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName2);

        JLabel labelSubName3 = new JLabel();
        labelSubName3.setBounds(200, 230, 120, 30);
        labelSubName3.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName3);

        JLabel labelSubName4 = new JLabel();
        labelSubName4.setBounds(200, 260, 120, 30);
        labelSubName4.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName4);

        JLabel labelSubName5 = new JLabel();
        labelSubName5.setBounds(200, 290, 120, 30);
        labelSubName5.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName5);

        JLabel labelSubName6 = new JLabel();
        labelSubName6.setBounds(200, 320, 120, 30);
        labelSubName6.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelSubName6);

        JLabel labelMark1 = new JLabel();
        labelMark1.setBounds(550, 170, 120, 30);
        labelMark1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark1);

        JLabel labelMark2 = new JLabel();
        labelMark2.setBounds(550, 200, 120, 30);
        labelMark2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark2);

        JLabel labelMark3 = new JLabel();
        labelMark3.setBounds(550, 230, 120, 30);
        labelMark3.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark3);

        JLabel labelMark4 = new JLabel();
        labelMark4.setBounds(550, 260, 120, 30);
        labelMark4.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark4);

        JLabel labelMark5 = new JLabel();
        labelMark5.setBounds(550, 290, 120, 30);
        labelMark5.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark5);

        JLabel labelMark6 = new JLabel();
        labelMark6.setBounds(550, 320, 120, 30);
        labelMark6.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(labelMark6);

        JLabel labelMarks1 = new JLabel("Marks 1 : ");
        labelMarks1.setBounds(400, 170, 120, 30);
        labelMarks1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks1);

        JLabel labelMarks2 = new JLabel("Marks 2 : ");
        labelMarks2.setBounds(400, 200, 120, 30);
        labelMarks2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks2);

        JLabel labelMarks3 = new JLabel("Marks 3 : ");
        labelMarks3.setBounds(400, 230, 120, 30);
        labelMarks3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks3);

        JLabel labelMarks4 = new JLabel("Marks 4 : ");
        labelMarks4.setBounds(400, 260, 120, 30);
        labelMarks4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks4);

        JLabel labelMarks5 = new JLabel("Marks 5 : ");
        labelMarks5.setBounds(400, 290, 120, 30);
        labelMarks5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks5);

        JLabel labelMarks6 = new JLabel("Marks 6 : ");
        labelMarks6.setBounds(400, 320, 120, 30);
        labelMarks6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMarks6);


        buttonBack= new JButton("Back");
        buttonBack.setBounds(300,500,100,20);
        buttonBack.setForeground(Color.white);
        buttonBack.setBackground(Color.BLACK);
        buttonBack.addActionListener(this);
        add(buttonBack);


        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from studentsubjects where roll_no = '"+rollNo+"'");
            while(resultSet.next()){
                labelSubName1.setText(resultSet.getString("subject1"));
                labelSubName2.setText(resultSet.getString("subject2"));
                labelSubName3.setText(resultSet.getString("subject3"));
                labelSubName4.setText(resultSet.getString("subject4"));
                labelSubName5.setText(resultSet.getString("subject5"));
                labelSubName6.setText(resultSet.getString("subject6"));
                labelName2.setText(resultSet.getString("name"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from studentmarks where roll_no = '"+rollNo+"'");
            while(resultSet.next()){
                labelMark1.setText(resultSet.getString("marks1"));
                labelMark2.setText(resultSet.getString("marks2"));
                labelMark3.setText(resultSet.getString("marks3"));
                labelMark4.setText(resultSet.getString("marks4"));
                labelMark5.setText(resultSet.getString("marks5"));
                labelMark6.setText(resultSet.getString("marks6"));

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        setUndecorated(true);
        setSize(700, 600);
        setLocation(500,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == buttonBack){
                setVisible(false);
                new ExaminationResult();
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ShowResult("");
    }
}
