import java.sql.*;
import java.io.*;
class ImageSave{
	public static void main(String args[])
    {
		try 
		{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection
            String url="jdbc:mysql://localhost:3306/study";
            String username="root";
            String password="Chiku@02";

            Connection con=DriverManager.getConnection(url,username,password);

            String q="insert into images(pic) values(?)";

            PreparedStatement psmt=con.prepareStatement(q);

            //psmt.setString(1,"value");

            FileInputStream fis=new FileInputStream("Ram.jpg");

            psmt.setBinaryStream(1,fis,fis.available());

            psmt.executeUpdate();

            System.out.println("Done...");
        }
        catch(Exception e)
        {
			e.printStackTrace();
		}
    }


}