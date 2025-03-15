import java.sql.*;
import java.io.*;
class jdbc2
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Trying to establish connection");
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("...............");
        Connection con=DriverManager.getConnection("jdbc:odbc:raj","demo","demo");
        System.out.println("Connected");
  Statement smt=con.createStatement();
        smt.executeUpdate("insert into worker values(120,'Gemini.G',5000)");
        System.out.println("Recordset updated");
     }
}
        
