import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class jdbc2
{

    public static void JDBCconnection(String url, String username, String password)
    {
        try
        {
            String query = "insert into jdbc(Email,UserName,Passwordd)values('dhiraj@gmail.com','dhiraj123','df2e34')";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement statement = conn.createStatement();

            statement.executeUpdate(query);
            
            statement.close();
            conn.close();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        System.out.println("JDBC Program");
        String url = "jdbc:mysql://localhost:port/mydb";
        String username = "rootusername";
        String password = "pass123";

        JDBCconnection(url,username,password);
    }
}
