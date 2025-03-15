import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class cook_demo extends HttpServlet
{
Cookie c1;
public void init()
{
        c1=new Cookie("First","india");
}
   public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   {
        response.setContentType("text/html");
        PrintWriter ps=response.getWriter();
        response.addCookie(c1);
        ps.println("cookies created");
   }
}	


     
   