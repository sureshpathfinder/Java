import java.sql.*;
import java.io.*;
class Select
{
public static void main(String args[])throws SQLException,IOException
{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
System.out.println("connecting to database...");
try
{
Connection con=DriverManager.getConnection("jdbc:odbc:alagudsn","student","ssi");
System.out.println("connected");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emplo7");
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
}
rs.close();
st.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
