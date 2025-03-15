import java.sql.*;
import java.io.*;

class D_jdbc_Ins
{
 public static void main(String args[])throws IOException
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:SAM");
  PreparedStatement ps = c.prepareStatement("select * from sdt");
 
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Enter Roll NO");
  String s1=br.readLine();
  int rno = Integer.parseInt(s1); 
  
  System.out.println("Enter Name");
  String name=br.readLine();
  
  ps.setInt(1,rno);
  ps.setString(2,name);
  
boolean b=ps.execute();
 

  if(!b)
    System.out.println("inserted");
  else
    System.out.println("Not inserted");
  
  }
  
  catch(Exception e)
  {
   System.out.println(e);
  }
  
 }
}

