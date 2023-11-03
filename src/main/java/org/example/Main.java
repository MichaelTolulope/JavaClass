package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    //------------ Method for adding user to the database-----------------------------------------C
    public void user_add() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full_app?serverTimezone=UTC","root","admin");
    PreparedStatement ps = con.prepareStatement("INSERT INTO users(USER_ID,FIRST_NAME,LAST_NAME,COURSE,COURSE_DESCRIPTION)VALUES(?,?,?,?,?)");
    ps.setInt(1,1);
    ps.setString(2,"Michael");
    ps.setString(3,"Gbenga");
    ps.setString(4,"Software developer and Drummer");
    ps.setString(5,"Full stack developer and teacher of Music Theory and practical");
    ps.executeUpdate();
}

//---------------- Method for getting data from the database -------------------------------------R
     public void getUserFromDb() throws SQLException, ClassNotFoundException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String sqlToGetUser =  "select * from users";
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full_app?serverTimezone=UTC","root","admin");
         Statement ps = con.createStatement();
         ResultSet rs = ps.executeQuery(sqlToGetUser);
         while (rs.next()) {

             int id =rs.getInt("USER_ID");
             String firstName = rs.getString("FIRST_NAME");
             String lastName = rs.getString("LAST_NAME");
             String course = rs.getString("COURSE");
             String courseDes = rs.getString("COURSE_DESCRIPTION");
             ArrayList<String> user = new ArrayList<>();

             user.add(String.valueOf(id));
             user.add(firstName);
             user.add(lastName);
             user.add(course);
             user.add(courseDes);
             System.out.println(user);
         }



     }

     //----------- Method for updating data in the database---------------------------------------U
     public void update_user(int userId) throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String updateSql = "UPDATE `users`\n" +
                 "SET\n" +
                 "`FIRST_NAME` = ?," +
                 "`LAST_NAME` = ?,"+
                 "`COURSE` = ?,"+
                 "`COURSE_DESCRIPTION` = ?"+
                 "WHERE USER_ID = "+userId+"; ";
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full_app?serverTimezone=UTC", "root", "admin");
         PreparedStatement ps = con.prepareStatement(updateSql);
         ps.setString(1, "Preye");
         ps.setString(2, "Precious");
         ps.setString(3, "Mechanics");
         ps.setString(4, "Anything pharmaceuticals");
         ps.executeUpdate();
     }
     //----------------Method for updating specific columns
    public void update_user(int userId, String columnName) throws ClassNotFoundException, SQLException {
        columnName.toUpperCase();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String updateSql = "UPDATE `users`\n" +
                "SET\n" +
                "`"+columnName+"` = ?," +
                "WHERE `USER_ID` = "+userId+"; ";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full_app?serverTimezone=UTC", "root", "admin");
        PreparedStatement ps = con.prepareStatement(updateSql);
        ps.setString(1, "Mechanics");
        ps.executeUpdate();
    }


     //----------- Method for deleting from the database------------------------------------------D
    public void delete_user(int userId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String del_sql = "delete from users where `USER_ID` = "+userId+";";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/full_app?serverTimezone=UTC","root","admin");
        PreparedStatement ps = con.prepareStatement(del_sql);
        ps.executeUpdate();

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Main dao = new Main();
        dao.user_add();
        System.out.println("Done adding...");
       System.out.println("deleted user with the id 5");
        System.out.println();
        System.out.println("These are all the users available -> ");
        dao.getUserFromDb();
    }
}