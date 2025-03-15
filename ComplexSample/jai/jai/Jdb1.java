import java.sql.*;
class Jdb1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection("Jdbc:Odbc:jay");
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from employee");
			while (r.next())
			{
				System.out.println(r.getString("empno") + "\t" + r.getString("name") + "\t" + r.getString("age"));
			}
		}
		catch (Exception e)
		{
		}
	}
}