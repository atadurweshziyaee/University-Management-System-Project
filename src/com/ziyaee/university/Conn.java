package com.ziyaee.university;

import java.sql.*;

public class Conn {

    Connection connection;
    Statement statement;
    Conn(){
       try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "Durwesh@123");
           statement = connection.createStatement();
       }
       catch (Exception e){
           e.printStackTrace();
       }

    }

    public static void main(String[] args) {
        new Conn();
    }

}
