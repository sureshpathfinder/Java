import java.sql.*;
import java.io.*;

class update
{
 public static void main(String args[])
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:sure","sa","");
  Statement ps = c.createStatement();
  int a= ps.executeUpdate("insert into emp values(8,'Ram',3000)");
  if(a!=0)
    System.out.println("Data Inserted");
  else
    System.out.println("Data Inserted Error");
  ResultSet rs=ps.executeQuery("select * from emp");
  while(rs.next())
  {
  System.out.println("Rno is "+rs.getInt(1)+" Name is "+rs.getString(2));
  }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

