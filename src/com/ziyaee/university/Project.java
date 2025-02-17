package com.ziyaee.university;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {

    JMenuItem facultyInfo, studentInfo, facultyDetail, studentDetail, facultyLeave, studentLeave;
    JMenuItem facultyLeaveDetails, studentLeaveDetails, result, marks, updateFacultyInfo, updateStudentInfo;
    JMenuItem feeStucture, feeForm;
    Project(){



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar menuBar = new JMenuBar();

        // Information
        JMenu menuList1 = new JMenu("New Admission");
        menuBar.add(menuList1);

        facultyInfo = new JMenuItem("Add Faculty Member");
        facultyInfo.addActionListener(this);
        menuList1.add(facultyInfo);

        studentInfo = new JMenuItem("New Student Admission");
        studentInfo.addActionListener(this);
        menuList1.add(studentInfo);

        // Details
        JMenu menuList2 = new JMenu("View Details");
        menuList2.setForeground(Color.RED);
        menuBar.add(menuList2);

        facultyDetail = new JMenuItem("View Faculty Detail");
        facultyDetail.addActionListener(this);
        menuList2.add(facultyDetail);

        studentDetail = new JMenuItem("View Student Detail");
        studentDetail.addActionListener(this);
        menuList2.add(studentDetail);


        // Leave
        JMenu menuList3 = new JMenu("Apply Leave");
        menuBar.add(menuList3);

        facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.addActionListener(this);
        menuList3.add(facultyLeave);

        studentLeave = new JMenuItem("Student Leave");
        studentLeave.addActionListener(this);
        menuList3.add(studentLeave);


        // Leave Details
        JMenu menuList4 = new JMenu("Leave Details");
        menuList4.setForeground(Color.RED);
        menuBar.add(menuList4);

        facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.addActionListener(this);
        menuList4.add(facultyLeaveDetails);

        studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.addActionListener(this);
        menuList4.add(studentLeaveDetails);

        // Exam
        JMenu menuList5 = new JMenu("Examination");
        menuBar.add(menuList5);

        result = new JMenuItem("Examination Result");
        result.addActionListener(this);
        menuList5.add(result);

        marks = new JMenuItem("Enter Marks");
        marks.addActionListener(this);
        menuList5.add(marks);

        // Update Info
        JMenu menuList6 = new JMenu("Update Information");
        menuList6.setForeground(Color.RED);
        menuBar.add(menuList6);

        updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.addActionListener(this);
        menuList6.add(updateFacultyInfo);

        updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.addActionListener(this);
        menuList6.add(updateStudentInfo);

        // Fee Details
        JMenu menuList7 = new JMenu("Fee");
        menuBar.add(menuList7);

        feeStucture = new JMenuItem("Fee Structure");
        feeStucture.addActionListener(this);
        menuList7.add(feeStucture);

        feeForm = new JMenuItem("Student Fee Form");
        feeForm.addActionListener(this);
        menuList7.add(feeForm);

        // Utility
        JMenu menuList8 = new JMenu("Utility");
        menuList8.setForeground(Color.red);
        menuBar.add(menuList8);

        JMenuItem cal = new JMenuItem("Calculator");
        cal.addActionListener(this);
        menuList8.add(cal);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.addActionListener(this);
        menuList8.add(notepad);


        // Exit
        JMenu menuList9 = new JMenu("Exit");
        menuBar.add(menuList9);

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        menuList9.add(exit);



        setJMenuBar(menuBar);


        setSize(1540,850);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String msg = e.getActionCommand();
            if(msg.equals("Exit")){
                System.exit(0);
            }
            else if(msg.equals("Calculator")){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
            else if(msg.equals("Notepad")){
                try{
                    Runtime.getRuntime().exec("Notepad.exe");
                }
                catch (Exception E){
                    E.printStackTrace();
                }
            }
            else if(e.getSource() == facultyInfo){
                new AddTeacherInfo();
            }
            else if(e.getSource() == studentInfo){
                new AddStudentInfo();
            }
            else if(e.getSource() == facultyDetail){
                new TeacherDetail();
            }
            else if(e.getSource() == studentDetail){
                new StudentDetail();
            }
            else if(e.getSource() == studentLeave){
                new StudentLeave();
            }
            else if(e.getSource() == facultyLeave){
                new TeacherLeave();
            }
            else if(msg.equals("Faculty Leave Details")){
                new TeacherLeaveDetail();
            }
            else if(msg.equals("Student Leave Details")){
                new StudentLeaveDetail();
            }
            else if(e.getSource() == updateFacultyInfo){
                new UpdateTeacherDetail();
            }
            else if(e.getSource() == updateStudentInfo){
                new UpdateStudentDetail();
            }
            else if(e.getSource() == marks){
                new StudentMarks();
            }
            else if(e.getSource() == result){
                new ExaminationResult();
            }
            else if(e.getSource() == feeStucture){
                new FeeStructure();
            }
            else if(e.getSource() == feeForm){
                new StudentFeeForm();
            }


        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
