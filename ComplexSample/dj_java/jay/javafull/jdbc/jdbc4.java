import java.sql.*;
import java.io.*;
class jdbc4
{
    public static void main(String args[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:raj","demo","demo");
        System.out.println("connected");
        PreparedStatement psmt=con.prepareStatement("insert into worker values(?,?,?)");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        do
        {
            System.out.println("Enter Employee number:");
            int a=Integer.parseInt(br.readLine());
            System.out.println("Enter Employee name:");
            String b=br.readLine();
            System.out.println("Enter Employee Salary:");
            int c=Integer.parseInt(br.readLine());
            psmt.setInt(1,a);
            psmt.setString(2,b);
            psmt.setInt(3,c);
            psmt.executeUpdate();
            System.out.println("Enter (yes) for insert (no) for quit");
        }
        while((str=br.readLine()).equals("yes"));
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery("select * from worker");
        System.out.println("Recordset Selected");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }

    }
}




