package com.ziyaee.university;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.Random;

public class UpdateTeacherDetail extends JFrame implements ActionListener {

    JTextField textCourse,textBranch2, textAddress, textPhoneNo, textEmail;
    JButton buttonUpdate, buttonClear, buttonCancel;
    JDateChooser dateChooser;
    JLabel labelEmpId2;

    Choice choose;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000l) + 1000l);

    UpdateTeacherDetail(){

        getContentPane().setBackground(new Color(70, 225, 242));

        JLabel labelheading = new JLabel("Update teacher detail");
        labelheading.setBounds(50,10,320,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 30));
        add(labelheading);

        JLabel labelChoice = new JLabel("Select Roll No : ");
        labelChoice.setBounds(500,10,150,20);
        labelChoice.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(labelChoice);

        choose = new Choice();
        choose.setBounds(650,10,150,20);
        choose.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(choose);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from teacher");
            while(resultSet.next()){
                choose.add(resultSet.getString("emp_id"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(100,70,150,30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        JLabel labelName2 = new JLabel();
        labelName2.setBounds(200,75,150,25);
        labelName2.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName2);

        JLabel labelFathersName = new JLabel("Father's Name : ");
        labelFathersName.setBounds(400,70,300,30);
        labelFathersName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelFathersName);

        JLabel labelFathersName2 = new JLabel();
        labelFathersName2.setBounds(550,75,200,25);
        labelFathersName2.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelFathersName2);

        JLabel labelEmpId = new JLabel("Emp Id : ");
        labelEmpId.setBounds(100,120,100,30);
        labelEmpId.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmpId);

        labelEmpId2 = new JLabel();
        labelEmpId2.setBounds(200,120,100,30);
        labelEmpId2.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelEmpId2);

        JLabel labelDOB = new JLabel("D.O.B : ");
        labelDOB.setBounds(400,120,100,30);
        labelDOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelDOB);

        JLabel labelDOB2 = new JLabel();
        labelDOB2.setBounds(550,120,200,25);
        labelDOB2.setFont(new Font("Raleway",Font.PLAIN,20));
        add(labelDOB2);

        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(100,160,150,30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setBounds(200,160,150,25);
        textAddress.setFont(new Font("Raleway",Font.PLAIN,16));
        add(textAddress);

        JLabel labelPhoneNo = new JLabel("Phone No : ");
        labelPhoneNo.setBounds(400,160,300,30);
        labelPhoneNo.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPhoneNo);

        textPhoneNo = new JTextField();
        textPhoneNo.setBounds(550,160,200,25);
        textPhoneNo.setFont(new Font("Raleway",Font.PLAIN,16));
        add(textPhoneNo);

        JLabel labelEmail = new JLabel("Email id : ");
        labelEmail.setBounds(100,200,150,30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(200,200,150,25);
        textEmail.setFont(new Font("Raleway",Font.PLAIN,16));
        add(textEmail);

        JLabel labelTen = new JLabel("Xth (%) : ");
        labelTen.setBounds(400,200,300,30);
        labelTen.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelTen);

        JLabel labelTen2 = new JLabel();
        labelTen2.setBounds(550,200,200,25);
        labelTen2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelTen2);

        JLabel labelTwelve = new JLabel("XIIth (%) : ");
        labelTwelve.setBounds(100,240,150,30);
        labelTwelve.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelTwelve);

        JLabel labelTwelve2 = new JLabel();
        labelTwelve2.setBounds(200,240,150,25);
        labelTwelve2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelTwelve2);

        JLabel labelAadhar = new JLabel("Aadhar No : ");
        labelAadhar.setBounds(400,240,300,30);
        labelAadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAadhar);

        JLabel labelAadhar2 = new JLabel();
        labelAadhar2.setBounds(550,240,200,25);
        labelAadhar2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelAadhar2);

        JLabel labelChooser = new JLabel("Qualification : ");
        labelChooser.setBounds(100,280,150,30);
        labelChooser.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelChooser);


        textCourse = new JTextField();
        textCourse.setBounds(235,280,150,25);
        textCourse.setFont(new Font("Raleway",Font.PLAIN,16));
        add(textCourse);

        JLabel labelBranch = new JLabel("Department : ");
        labelBranch.setBounds(400,280,300,30);
        labelBranch.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelBranch);

        textBranch2 = new JTextField();
        textBranch2.setBounds(550,280,200,25);
        textBranch2.setFont(new Font("Raleway",Font.PLAIN,16));
        add(textBranch2);


        try{
            Conn c = new Conn();
            String query = "select * from teacher where emp_id = '"+choose.getSelectedItem()+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while(resultSet.next()){
                labelName2.setText(resultSet.getString("name"));
                labelFathersName2.setText(resultSet.getString("father_name"));
                labelEmpId2.setText(resultSet.getString("emp_id"));
                labelDOB2.setText(resultSet.getString("dob"));
                textAddress.setText(resultSet.getString("address"));
                textPhoneNo.setText(resultSet.getString("phone_no"));
                textEmail.setText(resultSet.getString("email_address"));
                labelTen2.setText(resultSet.getString("tenth_percentage"));
                labelTwelve2.setText(resultSet.getString("twelve_percentage"));
                labelAadhar2.setText(resultSet.getString("aadhar_no"));
                textCourse.setText(resultSet.getString("qualification"));
                textBranch2.setText(resultSet.getString("department"));
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
                    String query = "select * from teacher where emp_id = '"+choose.getSelectedItem()+"'";
                    ResultSet resultSet = c.statement.executeQuery(query);
                    while(resultSet.next()){
                        labelName2.setText(resultSet.getString("name"));
                        labelFathersName2.setText(resultSet.getString("father_name"));
                        labelEmpId2.setText(resultSet.getString("emp_id"));
                        labelDOB2.setText(resultSet.getString("dob"));
                        textAddress.setText(resultSet.getString("address"));
                        textPhoneNo.setText(resultSet.getString("phone_no"));
                        textEmail.setText(resultSet.getString("email_address"));
                        labelTen2.setText(resultSet.getString("tenth_percentage"));
                        labelTwelve2.setText(resultSet.getString("twelve_percentage"));
                        labelAadhar2.setText(resultSet.getString("aadhar_no"));
                        textCourse.setText(resultSet.getString("qualification"));
                        textBranch2.setText(resultSet.getString("department"));
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        buttonUpdate = new JButton("Update");
        buttonUpdate.setBounds(150, 350, 150, 25);
        buttonUpdate.setBackground(Color.BLACK);
        buttonUpdate.setForeground(Color.white);
        buttonUpdate.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonUpdate.addActionListener(this);
        add(buttonUpdate);

        buttonClear = new JButton("Clear");
        buttonClear.setBounds(350, 350, 150, 25);
        buttonClear.setBackground(Color.BLACK);
        buttonClear.setForeground(Color.white);
        buttonClear.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonClear.addActionListener(this);
        add(buttonClear);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(550, 350, 150, 25);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        setLayout(null);
        setUndecorated(true);
        setSize(1000, 700);
        setLocation(300,50);
        setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == buttonClear){
            textAddress.setText("");
            textPhoneNo.setText("");
            textEmail.setText("");
            textCourse.setText("");
            textBranch2.setText("");
        }
        else if(e.getSource() == buttonUpdate){
            String address = textAddress.getText();
            String phNo = textPhoneNo.getText();
            String email = textEmail.getText();
            String course = textCourse.getText();
            String branch = textBranch2.getText();
            try{
                Conn c = new Conn();
                String query = "update teacher set address = '"+address+"', phone_no = '"+phNo+"', email_address =  '"+email+"', qualification =  '"+course+"', department = '"+branch+"' where emp_id = '"+choose.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Teacher details Updated successfully");
                setVisible(false);
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
        new UpdateTeacherDetail();
    }


}
