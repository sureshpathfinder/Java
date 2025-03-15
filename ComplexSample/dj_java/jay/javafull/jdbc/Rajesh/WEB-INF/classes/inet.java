import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
public class inet extends HttpServlet
{
       public void init()
        {}
       public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
        {
              PrintWriter out=response.getWriter();
              InetAddress ia=InetAddress.getByName("cmc-26");
             out.println(ia);
      }
}
