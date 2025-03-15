//access
import java.sql.*;
class jdbc6
{
  public static void main(String ar[]) throws SQLException,Exception
  {
    Connection con;
    Statement st;
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:jdbc2");
    st=con.createStatement();
    st.executeUpdate("drop table tab1");
    System.out.println("Table deleted");
    st.close();
    con.close();
  }
}
