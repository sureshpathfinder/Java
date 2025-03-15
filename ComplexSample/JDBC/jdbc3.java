//access
import java.sql.*;
import java.io.*;
class jdbc3
{
  public static void main(String ar[]) throws SQLException,Exception
  {
    Connection con;
    Statement st;
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:jdbc2");
    st=con.createStatement();
    DataInputStream din=new DataInputStream(System.in);
    String name;
    int age;
    System.out.println("Enter ur name and age");
    name=din.readLine();
    age=Integer.parseInt(din.readLine());
    st.executeUpdate("insert into tab1(name,age)values('"+name+"',"+age+")");
    System.out.println("inserted");
    st.close();
    con.close();
  }
}

