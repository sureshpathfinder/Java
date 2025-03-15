import java.sql.*;
class JData
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection("jdbc:odbc:jk");
			Statement s = c.createStatement();
			s.executeUpdate("update emp set name='Gopi' where empno=106");
			ResultSet r = s.executeQuery("select * from emp");
			while (r.next())
			{
				System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t" + r.getInt(3));
			}
		}
		catch (SqlException s) { }
            catch(
		
	}
}