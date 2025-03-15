
import java.sql.*;
import java.io.*;
class jdbc3
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Trying to establish connection");
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:raj","demo","demo");
        System.out.println("Connected");
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from worker");
        System.out.println("Recordset Selected");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
    }
}

