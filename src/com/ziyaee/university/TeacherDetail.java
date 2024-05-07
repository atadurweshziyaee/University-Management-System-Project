package com.ziyaee.university;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class TeacherDetail extends JFrame implements ActionListener {

        Choice choose;
        JButton buttonSearch, buttonAdd, buttonUpdate, buttonCancel, buttonPrint;
        JTable table;
        TeacherDetail(){

            setLayout(null);
            getContentPane().setBackground(new Color(24, 94, 102));

            JLabel labelEmpId = new JLabel("Select Employee Id : ");
            labelEmpId.setFont(new Font("Raleway", Font.PLAIN, 20));
            labelEmpId.setBounds(100,20,200,20);
            labelEmpId.setForeground(Color.white);
            add(labelEmpId);

            choose = new Choice();
            choose.setBounds(300,20,200,20);
            add(choose);

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

            buttonAdd = new JButton("Add");
            buttonAdd.setBounds(340,50,100,20);
            buttonAdd.setForeground(Color.white);
            buttonAdd.setBackground(Color.BLACK);
            buttonAdd.addActionListener(this);
            add(buttonAdd);

            buttonUpdate = new JButton("Update");
            buttonUpdate.setBounds(460,50,100,20);
            buttonUpdate.setForeground(Color.white);
            buttonUpdate.setBackground(Color.BLACK);
            buttonUpdate.addActionListener(this);
            add(buttonUpdate);

            buttonCancel = new JButton("Cancel");
            buttonCancel.setBounds(580,50,100,20);
            buttonCancel.setForeground(Color.white);
            buttonCancel.setBackground(Color.BLACK);
            buttonCancel.addActionListener(this);
            add(buttonCancel);


            try{
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery("Select * from teacher");
                while(resultSet.next()){
                    choose.add(resultSet.getString("emp_id"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

            table = new JTable();
            table.setBackground(Color.yellow);

            try{
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery("select * from teacher");
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            catch(Exception e){
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

                String query = "Select * from teacher where emp_id = '"+choose.getSelectedItem()+"'";
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
            else if(e.getSource() == buttonAdd){
                setVisible(false);
                new AddTeacherInfo();
            }
            else if(e.getSource() == buttonUpdate){
                    setVisible(false);
                    new UpdateTeacherDetail();
            }
            else if(e.getSource() == buttonCancel){
                setVisible(false);
            }
        }

        public static void main(String[] args) {

            new TeacherDetail();
        }
}
