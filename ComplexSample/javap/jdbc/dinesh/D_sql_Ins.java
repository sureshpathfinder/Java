import java.sql.*;
import java.io.*;

class D_sql_Ins
{
 public static void main(String args[])throws IOException
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:NEWDBS","sa","");
  PreparedStatement ps = c.prepareStatement("insert into tab values(?,?)");
 
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Enter EMPno");
  String s1=br.readLine();
  int rno = Integer.parseInt(s1); 
  
  System.out.println("Enter EMPName");
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

