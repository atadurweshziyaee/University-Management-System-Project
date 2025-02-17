package com.ziyaee.university;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class StudentMarks extends JFrame implements ActionListener {

    Choice choose;
    JComboBox choose2;

    JButton buttonSubmit, buttonClear, buttonCancel;
    JLabel labelName2;

    JTextField textSub1, textSub2, textSub3, textSub4, textSub5, textSub6, textMark1, textMark2, textMark3, textMark4, textMark5, textMark6;
    StudentMarks(){
        setLayout(null);
        getContentPane().setBackground(new Color(70, 225, 242));

        JLabel labelheading = new JLabel("Upload Student Marks");
        labelheading.setBounds(225,10,320,30);
        labelheading.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelheading);

        JLabel labelChoice = new JLabel("Select Roll No : ");
        labelChoice.setBounds(100,100,150,30);
        labelChoice.setFont(new Font("Raleway", Font.PLAIN, 20));
        add(labelChoice);

        choose = new Choice();
        choose.setBounds(300,100,150,20);
        choose.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(choose);

        try{
            Conn c = new Conn();
            String query = "select * from student";
            ResultSet resultSet = c.statement.executeQuery(query);
            while(resultSet.next()){
                choose.add(resultSet.getString("roll_no"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(100,130,150,30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelName);

        labelName2 = new JLabel();
        labelName2.setBounds(200,130,150,25);
        labelName2.setFont(new Font("Raleway",Font.BOLD,16));
        add(labelName2);

        JLabel labelChooseSem = new JLabel("Semester : ");
        labelChooseSem.setBounds(450,130,100,30);
        labelChooseSem.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelChooseSem);


        String sem[] = {"Sem-I", "Sem-II", "Sem-III", "Sem-IV", "Sem-V", "Sem-VI", "Sem-VII", "Sem-VIII"};
        choose2 = new JComboBox(sem);
        choose2.setBounds(550, 135, 100, 20);
        choose2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(choose2);

        JLabel labelSub1 = new JLabel("Subject 1 : ");
        labelSub1.setBounds(100, 170, 120, 30);
        labelSub1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub1);

        textSub1 = new JTextField();
        textSub1.setBounds(200, 175, 200, 20);
        textSub1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub1);

        JLabel labelSub2 = new JLabel("Subject 2 : ");
        labelSub2.setBounds(100, 200, 120, 30);
        labelSub2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub2);

        textSub2 = new JTextField();
        textSub2.setBounds(200, 205, 200, 20);
        textSub2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub2);

        JLabel labelSub3 = new JLabel("Subject 3 : ");
        labelSub3.setBounds(100, 230, 120, 30);
        labelSub3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub3);

        textSub3 = new JTextField();
        textSub3.setBounds(200, 235, 200, 20);
        textSub3.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub3);

        JLabel labelSub4 = new JLabel("Subject 4 : ");
        labelSub4.setBounds(100, 260, 120, 30);
        labelSub4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub4);

        textSub4 = new JTextField();
        textSub4.setBounds(200, 265, 200, 20);
        textSub4.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub4);

        JLabel labelSub5 = new JLabel("Subject 5 : ");
        labelSub5.setBounds(100, 290, 120, 30);
        labelSub5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub5);

        textSub5 = new JTextField();
        textSub5.setBounds(200, 295, 200, 20);
        textSub5.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub5);

        JLabel labelSub6 = new JLabel("Subject 6 : ");
        labelSub6.setBounds(100, 320, 120, 30);
        labelSub6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelSub6);

        textSub6 = new JTextField();
        textSub6.setBounds(200, 325, 200, 20);
        textSub6.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textSub6);


        JLabel labelMark1 = new JLabel("Marks 1 : ");
        labelMark1.setBounds(450,170,100,30);
        labelMark1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark1);

        textMark1 = new JTextField();
        textMark1.setBounds(550,175,100,20);
        textMark1.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark1);


        JLabel labelMark2 = new JLabel("Marks 2 : ");
        labelMark2.setBounds(450,200,100,30);
        labelMark2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark2);

        textMark2 = new JTextField();
        textMark2.setBounds(550,205,100,20);
        textMark2.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark2);

        JLabel labelMark3 = new JLabel("Marks 3 : ");
        labelMark3.setBounds(450,230,100,30);
        labelMark3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark3);

        textMark3 = new JTextField();
        textMark3.setBounds(550,235,100,20);
        textMark3.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark3);

        JLabel labelMark4 = new JLabel("Marks 4 : ");
        labelMark4.setBounds(450,260,100,30);
        labelMark4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark4);

        textMark4 = new JTextField();
        textMark4.setBounds(550,265,100,20);
        textMark4.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark4);

        JLabel labelMark5 = new JLabel("Marks 5 : ");
        labelMark5.setBounds(450,290,100,30);
        labelMark5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark5);

        textMark5 = new JTextField();
        textMark5.setBounds(550,295,100,20);
        textMark5.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark5);

        JLabel labelMark6 = new JLabel("Marks 6 : ");
        labelMark6.setBounds(450,320,100,30);
        labelMark6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelMark6);

        textMark6 = new JTextField();
        textMark6.setBounds(550,325,100,20);
        textMark6.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(textMark6);

        try{
            Conn c = new Conn();
            String query = "select * from student where roll_no = '"+choose.getSelectedItem()+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while(resultSet.next()){
                labelName2.setText((resultSet.getString("name")));
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
                    }
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(120, 380, 100, 25);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.white);
        buttonSubmit.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonClear = new JButton("Clear");
        buttonClear.setBounds(320, 380, 100, 25);
        buttonClear.setBackground(Color.BLACK);
        buttonClear.setForeground(Color.white);
        buttonClear.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonClear.addActionListener(this);
        add(buttonClear);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(520, 380, 100, 25);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.white);
        buttonCancel.setFont(new Font("Raleway", Font.PLAIN, 20));
        buttonCancel.addActionListener(this);
        add(buttonCancel);


        setUndecorated(true);
        setSize(700, 600);
        setLocation(500,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonSubmit){

            try{
                String name = labelName2.getText();
                String sub1 = textSub1.getText();
                String sub2 = textSub2.getText();
                String sub3 = textSub3.getText();
                String sub4 = textSub4.getText();
                String sub5 = textSub5.getText();
                String sub6 = textSub6.getText();

                String marks1 = textMark1.getText();
                String marks2 = textMark2.getText();
                String marks3 = textMark3.getText();
                String marks4 = textMark4.getText();
                String marks5 = textMark5.getText();
                String marks6 = textMark6.getText();


                Conn c = new Conn();
                String query1 = "insert into studentsubjects values ('"+choose.getSelectedItem()+"', '"+name+"', '"+choose2.getSelectedItem()+"', '"+sub1+"', '"+sub2+"', '"+sub3+"', '"+sub4+"', '"+sub5+"', '"+sub6+"')";
                String query2 = "insert into studentmarks values ('"+choose.getSelectedItem()+"', '"+name+"', '"+choose2.getSelectedItem()+"', '"+marks1+"', '"+marks2+"', '"+marks3+"', '"+marks4+"', '"+marks5+"', '"+marks6+"')";
                c.statement.executeUpdate(query1);
                c.statement.executeUpdate(query2);

                JOptionPane.showMessageDialog(null,"Subject & Marks Uploaded Successfully");
                setVisible(false);

            }
            catch (Exception E){
                E.printStackTrace();
            }

        }
        else if(e.getSource() == buttonClear){
            textSub1.setText("");
            textSub2.setText("");
            textSub3.setText("");
            textSub4.setText("");
            textSub5.setText("");
            textSub6.setText("");

            textMark1.setText("");
            textMark2.setText("");
            textMark3.setText("");
            textMark4.setText("");
            textMark5.setText("");
            textMark6.setText("");

        }
        else if(e.getSource() == buttonCancel){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentMarks();
    }

}
