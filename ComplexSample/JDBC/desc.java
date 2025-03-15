// program to print the data from database

import java.io.*;
import java.sql.*;

class descrip
 {
    public static void main(String args[])throws Exception
     {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("Jdbc:Odbc:sam","scott","tiger");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from kannan");
	System.out.println("Emp No\t Name \t Salary");
	
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.println(rs.getInt(3));
	}
 	rs.close();
	st.close();
	con.close();
        }
 }

