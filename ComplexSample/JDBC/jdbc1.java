//access
import java.io.*;
import java.sql.*;
class jdbc1
{
  public static void main(String args[])throws IOException
  {
    String no,name;
    int sal;
    try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con = DriverManager.getConnection("jdbc:odbc:jdbc1");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from employee");
      while (rs.next())
      {
        no = rs.getString(1);
        name = rs.getString(2);
        sal=rs.getInt(3);
        System.out.println("no     :" + no);
        System.out.println("name   :" + name);
        System.out.println("salary :" + sal);
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
