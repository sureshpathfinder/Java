import java.sql.*;
import java.io.*;

class DbInsert
{
 public static void main(String args[])throws IOException
 {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection c = DriverManager.getConnection("jdbc:odbc:sample");
  PreparedStatement ps = c.prepareStatement("insert into emp values (?,?,?)");
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  ps.setInt(1,23);
  ps.setString(2,"Hari");
  ps.setInt(3,34000);
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

