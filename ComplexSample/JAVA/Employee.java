import java.sql.*;
class Employee
{
public static void main(String args[])throws SQLException
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
System.out.println("Connecting to database....");
try
{
Connection con=DriverManager.getConnection("jdbc:odbc:q1","scott","tiger");
System.out.println("connected");
Statement st=con.createStatement();
st.executeUpdate("create table emplo765(eno number(3),ename varchar(20))");
System.out.println("Table created");
}
catch(Exception e)
{
System.out.println("exception is:"+e);
}
}
}
