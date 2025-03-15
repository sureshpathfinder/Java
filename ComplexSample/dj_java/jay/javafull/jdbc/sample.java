import java.sql.*;
class sample
{
        static Connection con;
        public static void main(String ar[])throws Exception
        {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                open();
        	//    select();
              //  insert();
          // delete();
              update(true);
                close();
        }
        static void open()throws SQLException
        {
                String dsn="jdbc:odbc:raj";
                String user="demo";
                String password="demo";
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
      /*  static void insert()
        {
                try
                {
                        Statement stmt;
                        String sql;
                        int rows;
                        stmt=con.createStatement();
                        rows=stmt.executeUpdate("INSERT INTO worker VALUES(533,'Vishwa',7000)");
                        con.commit();
                        stmt.close();
                        System.out.println(rows+ " Rows added");
                }catch(SQLException e)
                {
                        System.out.println("Error while inserting");
                }
        }
        static void select()throws SQLException
        {
                Statement stmt;
                String query;
                ResultSet rs;
                boolean more;
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT id,name,salary FROM worker");
                more=rs.next();
                if(!more)
                {
                        System.out.println("No rows Found");
                        return;
                }
                while(more)
                {
                        System.out.println("ID : "+rs.getInt("id"));
                        System.out.println("Name : "+rs.getString("name"));
                        System.out.println("Marks : "+rs.getInt("salary"));
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
                        rows=stmt.executeUpdate("DELETE FROM worker WHERE id=533");
                        con.commit();
                        stmt.close();
                        System.out.println(rows+" Rows delete");
                }catch(SQLException e)
                {
                        System.out.println("Error While Deleting");
                }
        }*/
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
                                rows=stmt.executeUpdate("UPDATE student SET studname='" +name+ "' WHERE studid=120");
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
        }

}
                


