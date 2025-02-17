package com.ziyaee.university;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textUsername;
    JPasswordField pwdField;
    JButton buttonLogin,buttonCancel;
    Login(){

        setLayout(null);
        getContentPane().setBackground(new Color(128, 131, 201));

        JLabel labelUsername = new JLabel("Username : ");
        labelUsername.setBounds(40,40,150,20);
        labelUsername.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelUsername);

        textUsername = new JTextField();
        textUsername.setBounds(200,40,150,20);
        textUsername.setFont(new Font("Raleway", Font.BOLD, 20));
        textUsername.setBackground(new Color(128, 131, 201));
        add(textUsername);

        JLabel labelpassword = new JLabel("Password : ");
        labelpassword.setBounds(40,80,150,20);
        labelpassword.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelpassword);

        pwdField  = new JPasswordField();
        pwdField.setBounds(200,80,150,20);
        pwdField.setFont(new Font("Raleway", Font.BOLD, 20));
        pwdField.setBackground(new Color(128, 131, 201));
        add(pwdField);

        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(40,120,120,30);
        buttonLogin.setFont(new Font("Raleway",Font.PLAIN,20));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(Color.BLACK);
        buttonLogin.addActionListener(this);
        add(buttonLogin);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(200,120,120,30);
        buttonCancel.setFont(new Font("Raleway",Font.PLAIN,20));
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,25,200,200);
        add(image);


        setLocation(450,200);
        setUndecorated(true);
        setSize(700, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = textUsername.getText();
        String password = pwdField.getText();

        if(e.getSource() == buttonLogin){
            if(textUsername.getText().equals("") || pwdField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                try{
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from login where username = '" + username + "' and password = '" + password + "' ");
                    if(resultSet.next()){
                        setVisible(false);
                        new Project();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Invalid username and password");
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
        }
        else if(e.getSource() == buttonCancel){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
