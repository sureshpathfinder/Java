import java.sql.*;
import java.io.*;

class select1
{
 public static void main(String args[])
 {
  try
  {
  Class.forName("com.mysql.jdbc.Driver");
  Connection c = DriverManager.getConnection("jdbc:mysql:/emplw","sa","Server");
  Statement ps = c.createStatement();
  ResultSet rs=ps.executeQuery("select * from stud");
  while(rs.next())
  {
  System.out.println("roll no is "+rs.getInt(1)+" Name is "+rs.getString(2)+"  marks ="+rs.getInt(3));
  }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

