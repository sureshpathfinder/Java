import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.*;
import java.io.*;
public class date_demo extends HttpServlet
{
     Date d;
     SimpleDateFormat sdf1,sdf2,sdf3;
      int i;
     public void init()
     {
         i=0;  
         d=new Date();
          sdf1=new SimpleDateFormat("dd:MMM:yyyy");
          sdf2=new SimpleDateFormat("MM:dd:yy");
          sdf3=new SimpleDateFormat("hh:mm:ss:a");
         }
  public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   {
          response.setContentType("text/html");
          response.setHeader("refresh","3");
          PrintWriter ps=response.getWriter();
          ps.println("<body bgcolor=gray>");
          ps.println("<h1>"+ sdf1.format(d) +"</h1>");
          ps.println("<h1>"+ sdf2.format(d) +"</h1>");
          ps.println("<h1>"+ sdf3.format(d) +"</h1>");
         ps.println("<h1>" + i++ +"</h1>");
        }
}    


