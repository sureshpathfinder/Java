// program to print the data from database

import java.io.*;
import java.sql.*;
class descrip1
 {
    public static void main(String args[])throws Exception
     {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             Connection con=DriverManager.getConnection("Jdbc:Odbc:danger","scott","tiger");
	Statement st=con.createStatement();
 DatabaseMetaData dm=con.getMetaData();
	int s=dm.getMaxColumnsInTable();
	/*System.out.println("Name \t\t FieldType & Size");	
	while(rs.next())
	{
		System.out.print(rs.getString(1)+"\t\t");
		System.out.println(rs.getString(2));
	}*/
	System.out.println(s);
 	//rs.close();
	st.close();
	con.close();
        }
 }