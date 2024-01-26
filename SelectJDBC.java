
package com.jdbc.practice;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class SelectJDBC {
    public static void main(String[] args) {
        try {
            Connection con=ConnectionProvider.getConnection();
            
            String query="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet set= stmt.executeQuery(query);
            
            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3); // 3 represents colom.
                
                System.out.println(id + ":" + name + ":" + city);
            }
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
