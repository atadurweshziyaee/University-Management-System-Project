package com.ziyaee.university;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddStudentInfo extends JFrame implements ActionListener {

    JTextField textName, textFathersName, textAddress, textPhoneNo, textEmail, textTen, textTwelve, textAadhar;
    JComboBox comboBoxCourse, comboBoxBranch;
    JButton buttonSubmit, buttonClear, buttonCancel;
    JDateChooser dateChooser;
    JLabel labelRollNo2;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000l) + 1000l);

    AddStudentInfo(){
        getContentPane().setBackground(new Color(70, 225, 242));

        JLabel labelheading = new JLabel("New Student detail");
        labelheading.setBounds(380,20,300,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 30));
        add(labelheading);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(100,70,150,30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(200,75,150,25);
        textName.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textName);

        JLabel labelFathersName = new JLabel("Father's Name : ");
        labelFathersName.setBounds(400,70,300,30);
        labelFathersName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelFathersName);

        textFathersName = new JTextField();
        textFathersName.setBounds(550,75,200,25);
        textFathersName.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textFathersName);

        JLabel labelRollNo = new JLabel("Roll No : ");
        labelRollNo.setBounds(100,120,100,30);
        labelRollNo.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelRollNo);

        labelRollNo2 = new JLabel("2024"+first4);
        labelRollNo2.setBounds(200,120,100,25);
        labelRollNo2.setFont(new Font("Raleway",Font.PLAIN,20));
        add(labelRollNo2);

        JLabel labelDOB = new JLabel("D.O.B : ");
        labelDOB.setBounds(400,120,100,30);
        labelDOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(550,120,200,25);
        dateChooser.setFont(new Font("Raleway",Font.PLAIN,20));
        add(dateChooser);

        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(100,160,150,30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setBounds(200,160,150,25);
        textAddress.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textAddress);

        JLabel labelPhoneNo = new JLabel("Phone No : ");
        labelPhoneNo.setBounds(400,160,300,30);
        labelPhoneNo.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPhoneNo);

        textPhoneNo = new JTextField();
        textPhoneNo.setBounds(550,160,200,25);
        textPhoneNo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textPhoneNo);

        JLabel labelEmail = new JLabel("Email id : ");
        labelEmail.setBounds(100,200,150,30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(200,200,150,25);
        textEmail.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textEmail);

        JLabel labelTen = new JLabel("Xth (%) : ");
        labelTen.setBounds(400,200,300,30);
        labelTen.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelTen);

        textTen = new JTextField();
        textTen.setBounds(550,200,200,25);
        textTen.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textTen);

        JLabel labelTwelve = new JLabel("XIIth (%) : ");
        labelTwelve.setBounds(100,240,150,30);
        labelTwelve.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelTwelve);

        textTwelve = new JTextField();
        textTwelve.setBounds(200,240,150,25);
        textTwelve.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textTwelve);

        JLabel labelAadhar = new JLabel("Aadhar No : ");
        labelAadhar.setBounds(400,240,300,30);
        labelAadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAadhar);

        textAadhar = new JTextField();
        textAadhar.setBounds(550,240,200,25);
        textAadhar.setFont(new Font("Raleway",Font.PLAIN,20));
        add(textAadhar);

        JLabel labelChooser = new JLabel("Course : ");
        labelChooser.setBounds(100,280,150,30);
        labelChooser.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelChooser);

        String course[] = {"B.tech", "BBA", "BCA", "Bsc", "B.com", "BA", "Msc", "M.tech", "MBA", "MCA", "MCom", "MA"};
        comboBoxCourse = new JComboBox(course);
        comboBoxCourse.setBounds(200,280,150,25);
        comboBoxCourse.setFont(new Font("Raleway",Font.BOLD,20));
        add(comboBoxCourse);

        JLabel labelBranch = new JLabel("Branch : ");
        labelBranch.setBounds(400,280,300,30);
        labelBranch.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelBranch);

        String branch[] = {"CSE(DS)", "CSE", "Artificial Intelligence", "ECE", "EE", "Mechanical", "Civil", "IT", };
        comboBoxBranch = new JComboBox(branch);
        comboBoxBranch.setBounds(550,280,200,25);
        comboBoxBranch.setFont(new Font("Raleway",Font.BOLD,20));
        add(comboBoxBranch);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(150, 350, 150, 25);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.white);
        buttonSubmit.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

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
            textName.setText("");
            textFathersName.setText("");
            dateChooser.setDate(null);
            textAddress.setText("");
            textPhoneNo.setText("");
            textEmail.setText("");
            textTen.setText("");
            textTwelve.setText("");
            textAadhar.setText("");
        }
        else if(e.getSource() == buttonSubmit){
            String name = textName.getText();
            String fatherName = textFathersName.getText();
            String rollNo = labelRollNo2.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String address = textAddress.getText();
            String phNo = textPhoneNo.getText();
            String email = textEmail.getText();
            String ten = textTen.getText();
            String twelve = textTwelve.getText();
            String aadhar = textAadhar.getText();
            String course = (String) comboBoxCourse.getSelectedItem();
            String branch = (String) comboBoxBranch.getSelectedItem();

            try{
                Conn c = new Conn();
                String query = "insert into student values('"+name+"', '"+fatherName+"', '"+rollNo+"', '"+dob+"', '"+address+"', '"+phNo+"', '"+email+"', '"+ten+"', '"+twelve+"', '"+aadhar+"', '"+course+"', '"+branch+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Student details added successfully");
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
        new AddStudentInfo();
    }
}
