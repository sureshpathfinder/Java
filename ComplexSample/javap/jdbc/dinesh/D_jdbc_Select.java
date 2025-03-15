import java.sql.*;
import java.io.*;

class D_jdbc_Select
{
 public static void main(String args[])
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection c = DriverManager.getConnection("jdbc:odbc:new","sa","");   //DB source name and PSW
 PreparedStatement ps = c.prepareStatement("select * from aaa");
 ResultSet rs=ps.executeQuery();

 while(rs.next())
 {
  System.out.println("Emp no is "+rs.getInt(1));
  System.out.println("EName is "+rs.getString(2));
 }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

