//access
import java.sql.*;
class jdbc5
{
  public static void main(String ar[]) throws SQLException,Exception
  {
    Connection con;
    Statement st;
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:jdbc2");
    st=con.createStatement();
    st.executeUpdate("delete from tab1 where age=100");
    System.out.println("deleted");
    st.close();
    con.close();
  }
}

