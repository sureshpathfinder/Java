//access
import java.sql.*;
class jdbc2
{
  public static void main(String ar[]) throws SQLException,Exception
  {
    Connection con;
    Statement st;
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:jdbc2");
    st=con.createStatement();
    st.executeUpdate("create table tab2(name text(20),age int)");
    System.out.println("Table tab1 created");
    st.close();
    con.close();
  }
}
