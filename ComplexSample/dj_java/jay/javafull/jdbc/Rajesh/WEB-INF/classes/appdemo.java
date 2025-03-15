import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class appdemo extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
      response.setContentType("text/html");
      PrintWriter ps=response.getWriter();
      ServletContext s1=getServletContext();
      s1.setAttribute("Application","Application variables are Global Varaibles");
      ps.println(s1.getAttribute("Application"));
     }
}
	