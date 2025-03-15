import java.sql.*;
import java.io.*;

class select
{
 public static void main(String args[])
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:sample","","");
  Statement ps = c.createStatement();
  ResultSet rs=ps.executeQuery("select * from emp");
  while(rs.next())
  {
  System.out.println("Sno is "+rs.getInt(1)+" Name is "+rs.getString(2)+"  Salary="+rs.getInt(3));
  }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

