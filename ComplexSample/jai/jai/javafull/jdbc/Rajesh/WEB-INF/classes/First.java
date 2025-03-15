import javax.servlet.*;
import java.io.*;
public class First extends GenericServlet
{
	public void service(ServletRequest rq,ServletResponse rs)throws ServletException,IOException
	{
		PrintWriter out=rs.getWriter();
		String uname=rq.getParameter("t1");
		String pwd=rq.getParameter("t2");
		if(uname.equals("Rajesh")&&pwd.equals("Karthik"))
		out.println("<h1> Correct");
		else
		out.println("<h1> Incorrect");
		
		
	}
}