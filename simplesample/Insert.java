import java.sql.*;
import java.io.*;
import java.lang.String;
class Insert
{
public static void main(String args[]) throws SQLException,IOException
{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
System.out.println("Connecting to database....");

Connection con=DriverManager.getConnection("jdbc:odbc:alagudsn","student","ssi");
System.out.println("connected");
Statement st=con.createStatement();
try
{
char resp='y';
while((char)System.in.read()=='y')
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String chk=b.readLine();
String str=readEntry("Enter the insert statement");
st.executeUpdate(str);
System.out.println("one row inserted");
System.out.println("do u want to insert another row(y/n)");
}
}
catch(SQLException e)
{
System.out.println(e);
}
st.close();
con.close();
}
static String readEntry(String prompt)
{
String c;
try
{
StringBuffer buffer=new StringBuffer();
System.out.println(prompt);
System.out.flush();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
c=br.readLine();
return c;
}
catch(IOException e)
{
System.out.println(e);
return " ";
}
}
}
 