import java.sql.*;
class Insert1
{
public static void main(String args[])throws SQLException
{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
System.out.println("connecting to database...");
try
{
Connection con=DriverManager.getConnection("jdbc:odbc:apache","student","ssi");
System.out.println("connected");
String i="insert into emplo14 values(?,?)";
PreparedStatement ps=con.prepareStatement(i);
ps.setInt(1,4);
ps.setString(2,"ddd");

ps.executeUpdate();
System.out.println("one row inserted");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
