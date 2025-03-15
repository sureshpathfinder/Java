import java.sql.*;
public class sql1
{
  public static void main(String[] args)
  {
    System.out.println("Creating a Mysql Table to Store Java Types!");
    Connection con = null;
    String url = "jdbc:mysql:";
    String db = "class1";
    String driver = "com.mysql.jdbc.Driver";
    String user = "sa";
    String pass = "";
    try
    {
      Class.forName(driver);
      con = DriverManager.getConnection(url+db, user, pass);   
      Statement st = con.createStatement();     
      ResultSet rs=st.executeQuery("select * from stud");
      while(rs.next())
      {
        System.out.println("roll no is "+rs.getInt(1)+" Name is "+rs.getString("name")+"  marks ="+rs.getInt(3));
      }
      con.close();
    }
    catch (SQLException s)
    {
      System.out.println(s);
    }
  }
  
}