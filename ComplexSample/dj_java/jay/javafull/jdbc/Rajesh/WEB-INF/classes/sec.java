import javax.servlet.*;
import java.io.*;
public class sec extends GenericServlet
{
	public void service(ServletRequest rq,ServletResponse rs)throws ServletException,IOException
	{
		PrintWriter out=rs.getWriter();
		String uname=rq.getParameter("t1");
		String gen=rq.getParameter("r1");
		String c1=rq.getParameter("c1");
		String c2=rq.getParameter("c2");
		String c3=rq.getParameter("c3");
		String sel=rq.getParameter("sel");
		out.println("<h1>Name:"+uname);
		out.println("<h1>Qualification");
		if(c1!=null)
			out.println("<h1> "+c1);

		if(c2!=null)
			out.println("<h1> "+c2);


		if(c3!=null)
			out.println("<h1> "+c3);
		out.println("<h1>"+gen);
		out.println("<h1>"+sel);

	}
}