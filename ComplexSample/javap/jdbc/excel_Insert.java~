import java.sql.*;
import java.io.*;

class DbInsert
{
 public static void main(String args[])throws IOException
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:salary","sa","");
  PreparedStatement ps = c.prepareStatement("insert into emp values (?,?,?)");
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Enter Emp NO");
  String s1=br.readLine();
  int rno = Integer.parseInt(s1); 
  
  System.out.println("Enter Name");
  String name=br.readLine();
  
  System.out.println("Enter Salary");
  String s2=br.readLine();
  int marks = Integer.parseInt(s2);

 
  ps.setInt(1,rno);
  ps.setString(2,name);
  ps.setInt(3,marks);
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

