import java.sql.*;
class jdbc1
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Trying to establish connection");
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println(".............");
System.out.println("Cograts welcometodb world");
        Connection          con=DriverManager.getConnection("jdbc:odbc:dd","scott","tiger");
        System.out.println("Connected");
         System.out.println("Cograts welcometodb world");
    }
}
        
