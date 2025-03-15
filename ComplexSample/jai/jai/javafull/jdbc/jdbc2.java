import java.sql.*;
import java.io.*;
class jdbc2
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Trying to establish connection");
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("...............");
        Connection con=DriverManager.getConnection("jdbc:odbc:dd","scott","tiger");
        System.out.println("Connected");
  Statement smt=con.createStatement();
        smt.executeUpdate("insert into dd values('adf',67,89,79)");
        System.out.println("Recordset updated");
con.close();
     }
}
        
