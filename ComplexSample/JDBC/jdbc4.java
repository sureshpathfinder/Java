//access
import java.sql.*;
import java.io.*;
class jdbc4
{
  public static void main(String ar[]) throws SQLException,IOException,Exception
  {
    Connection con;
    Statement st;
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:jdbc2");
    st=con.createStatement();
    DataInputStream din=new DataInputStream(System.in);
    String name;
    int age;
    System.out.println("Enter ur name and modified age");
    name=din.readLine();
    age=Integer.parseInt(din.readLine());
    st.executeUpdate("update tab1 set age="+age+" where name='"+name+"'");
    System.out.println("table is updated");
    st.close();
    con.close();
  }
}
