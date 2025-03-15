import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class appdemo1 extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       PrintWriter out=res.getWriter();
       res.setContentType("text/html");
       ServletContext s1=getServletContext();
       out.println(s1.getAttribute("Application"));
    }
}
       