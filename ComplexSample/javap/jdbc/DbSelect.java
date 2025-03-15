import java.sql.*;
import java.io.*;

class DbSelect
{
 public static void main(String args[])
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection c = DriverManager.getConnection("jdbc:odbc:stud1","","");
 PreparedStatement ps = c.prepareStatement("select * from stud");
 ResultSet rs=ps.executeQuery();
 while(rs.next())
 {
  System.out.println("Roll is "+rs.getInt(1)+" Name is "+rs.getString(2));
 }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

