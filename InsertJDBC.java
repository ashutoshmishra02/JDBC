import java.sql.*;
class InsertJDBC
{
	public static void main(String args[]){

		try{
             Class.forName("com.mysql.cj.jdbc.Driver"); //name of class:Driver  and was stored in package com.mysql.cj....

            //creating connection
            String url="jdbc:mysql://localhost:3306/study";
            String username="root";
            String password="Chiku@02";

            Connection con=DriverManager.getConnection(url,username,password);

            //create a query

            String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null , tCity varchar(400))";

            //create a statement

            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created in Database");
            con.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}