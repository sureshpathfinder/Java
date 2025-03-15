import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class sess extends HttpServlet
{
      public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        ServletOutputStream out=response.getOutputStream();
        HttpSession h1=request.getSession(true);
        h1.putValue("Mysession","india");
        out.println("created");
     }
}
  