import java.sql.*;
class sample
{
        static Connection con;
        public static void main(String ar[])throws Exception
        {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                open();
         //     select();
                insert();
         //     delete();
         //      update(true);
                close();
        }
        static void open()throws SQLException
        {
                String dsn="jdbc:odbc:student";
                String user="karthik";
                String password="password";
                con=DriverManager.getConnection(dsn,user,password);
                con.setAutoCommit(false);
                System.out.println("Connected Successfully");
        }
        static void close()throws SQLException
        {
                con.commit();
                con.close();
                System.out.println("Connection Destroyed");

        }
        static void insert()
        {
                try
                {
                        Statement stmt;
                        String sql;
                        int rows;
                        stmt=con.createStatement();
                        rows=stmt.executeUpdate("INSERT INTO student VALUES('S006','Vishwa','Acad',76");
                        con.commit();
                        stmt.close();
                        System.out.println(rows+ " Rows added");
                }catch(SQLException e)
                {
                        System.out.println("Error while inserting");
                }
        }
    /*    static void select()throws SQLException
        {
                Statement stmt;
                String query;
                ResultSet rs;
                boolean more;
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT studid,studname,course,marks FROM student");
                more=rs.next();
                if(!more)
                {
                        System.out.println("No rows Found");
                        return;
                }
                while(more)
                {
                        System.out.println("ID : "+rs.getString("studid"));
                        System.out.println("Name : "+rs.getString("studname"));
                        System.out.println("Course : "+rs.getString("course"));
                        System.out.println("Marks : "+rs.getInt("marks"));
                        System.out.println(" ");
                        more=rs.next();
                }
                rs.close();
                stmt.close();
        }
        static void delete()
        {
                try
                {
                        Statement stmt;
                        int rows;
                        stmt=con.createStatement();
                        rows=stmt.executeUpdate("DELETE FROM student WHERE studid='S005'");
                        con.commit();
                        stmt.close();
                        System.out.println(rows+" Rows delete");
                }catch(SQLException e)
                {
                        System.out.println("Error While Deleting");
                }
        }
        static void update(boolean commit)
        {
                try
                {
                        Statement stmt;
                        int rows;
                        String name="";
                        if(commit)
                        {
                                name="Gayathri V";
                        }
                                stmt=con.createStatement();
                                rows=stmt.executeUpdate("UPDATE student SET studname='" +name+ "' WHERE studid='S002'");
                                System.out.println("Record Updated Successfully");
                        if(commit)
                                con.commit();
                                else
                                con.rollback();
                                stmt.close();
                }catch(SQLException e)
                {
                        System.out.println("Error While Updating");
                }
        }*/


                        



}
                


