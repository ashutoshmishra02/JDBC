package com.jdbc.practice;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;

public class Main { 
    public static void main(String[] args) {
        try {
            Connection c=ConnectionProvider.getConnection();
            
            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt=c.prepareStatement(q);
            
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File file=jfc.getSelectedFile();
            FileInputStream fis=new FileInputStream(file);
            
            pstmt.setBinaryStream(1, fis, fis.available());
            
            pstmt.executeUpdate();
            
            //System.out.println("done...");
            JOptionPane.showMessageDialog(null, "success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
