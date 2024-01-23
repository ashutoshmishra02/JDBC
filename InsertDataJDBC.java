// using prepared statement: Insert
import java.sql.*;
class InsertDataJDBC{
    public static void main(String args[]){
          try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //name of class:Driver  and was stored in package com.mysql.cj....

            //creating connection
            String url="jdbc:mysql://localhost:3306/study";
            String username="root";
            String password="Chiku@02";

            Connection con=DriverManager.getConnection(url,username,password);


            // create query
            String q="insert into table1(tName,tCity) values (?,?)";

            //get the PreparedStatement object
            PreparedStatement pstmt=con.prepareStatement(q);

            //set the valuers to query
            //pstmt.setString(1,"Jai Shree Ram");
           // pstmt.setString(2,"Ayodhaya");

            pstmt.executeUpdate();  //don't pass query 'q' again,it will result in incomplete query.
            System.out.println("inserted...");

            con.close();

          }catch(Exception e){
               e.printStackTrace();
          }
    }
}