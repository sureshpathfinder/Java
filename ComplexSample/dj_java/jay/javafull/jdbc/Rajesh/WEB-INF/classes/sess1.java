import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class sess1 extends HttpServlet
{
	int i;
      public void init()
      {i=1;
	}
    public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        ServletOutputStream out=response.getOutputStream();
        HttpSession h1=request.getSession(false);
        h1.putValue("Mysession","india"+i);
	i++;

        out.println(h1.isNew() + "<br>");
        out.println(h1.getId() + "<br>");
       out.println(h1.getValue("Mysession")+ "<br>");
       h1.invalidate();
      out.println(h1.getMaxInactiveInterval());                                             
       try
        {
         out.println(h1.isNew());
         }catch(IllegalStateException ss)
          {
            out.println(ss.getMessage());
            out.println("Session killed");
          }
        
      }
}
