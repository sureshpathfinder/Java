// program to print the data from database

import java.io.*;
import java.sql.*;

class descrip
 {
    public static void main(String args[])throws Exception
     {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             Connection con=DriverManager.getConnection("Jdbc:Odbc:danger","scott","tiger");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("desc kannan");
	System.out.println("Name \t\t FieldType & Size");	
	while(rs.next())
	{
		System.out.print(rs.getString(1)+"\t\t");
		System.out.println(rs.getString(3));
	}
 	rs.close();
	st.close();
	con.close();
        }
 }

