import javax.servlet.* ;
import javax.servlet.http.*;
import java.io.* ;
import java.sql.* ;

public class jdbc_demo1 extends HttpServlet
{
       Connection con=null;
       Statement st=null;
       ResultSet rs=null;
       String name=null;
       int sal;
       int id;
    public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
            PrintWriter out=response.getWriter();
            id=Integer.parseInt(request.getParameter("t1"));
            name=request.getParameter("t2");
    sal=Integer.parseInt(request.getParameter("t3"));
     
        try 
           {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             con=DriverManager.getConnection("jdbc:odbc:Cmc1","scott","tiger");
             st=con.createStatement();
    //       st.execute("insert into emp values(112,'Babu',5400)");
              PreparedStatement ps=con.prepareStatement("insert into emp(empno,ename,sal) values (?,?,?)");
             ps.setInt(1,id);
             ps.setString(2,name);
             ps.setInt(3,sal);
             ps.executeUpdate();
             st.executeQuery("select * from emp");
             rs=st.getResultSet();
             out.println("<body>");
             out.println("<table align=center cellpadding=5 cellspacing=5 border=2>");
             while(rs.next())
              {
                    out.println("<tr>");
                    out.println("<td>"+ rs.getString(1));
                    out.println("<td>"+ rs.getString(2));
                    out.println("<td>"+ rs.getString(3));
                    out.println("</tr>");
                 }
              out.println("</table>");
	if(name.equals("Rajesh1"))
	{
	response.sendRedirect("appdemo");	
	}
	else
	{
	out.println("Not Correct");
	}
	
             }catch(Exception ee)
                    {             
                            out.println(ee);
                       }
              }
}

 
        