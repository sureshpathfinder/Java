import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class dogetpost extends HttpServlet
{
      String s;
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
      response.setContentType("text/html");
      PrintWriter ps=response.getWriter();
      s=request.getParameter("t1");
      ps.println("Request from get Method"+s.toLowerCase());
     }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
      response.setContentType("text/html");
      PrintWriter ps=response.getWriter();
      s=request.getParameter("t1");
      ps.println("Request from post Method"+s.toUpperCase());
     }
}