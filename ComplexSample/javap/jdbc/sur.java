import java.sql.*;
public class sur
{
    public static void main(String[] args) 
    {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
         Statement st=con.createStatement();
          ResultSet r=st.executeQuery("select * from dept");
         /*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection c = DriverManager.getConnection("jdbc:odbc:stud1","","");
         Statement st = c.createStatement();
         ResultSet r=st.executeQuery("select * from stud");*/
         while(r.next())
         {
             System.out.println(r.getInt(1)+"      "+r.getString(2));
         }

        }
        catch(Exception e){
            System.out.println(e);

        }
    }

}
