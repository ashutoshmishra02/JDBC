import java.sql.*;
class FirstJDBC
{
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

            if(con.isClosed()){
            	System.out.println("Connection is closed");
            }
            else 
            	System.out.println("Connection Created......");
		}
        catch(Exception e)
        {
			e.printStackTrace();
		}
	}
}