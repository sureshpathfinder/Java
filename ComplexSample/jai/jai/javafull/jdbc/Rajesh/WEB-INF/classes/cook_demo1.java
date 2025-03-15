import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class cook_demo1 extends HttpServlet
{
    
    public void init()
    {
     }
   public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   {
        response.setContentType("text/html");
        PrintWriter ps=response.getWriter();
        Cookie c3=new Cookie("First1","india");
        Cookie c4=new Cookie("Second1","cricket");
        response.addCookie(c3);
        response.addCookie(c4);

        Cookie cc[]=request.getCookies();

        for(int i=0;i<cc.length;i++)
   	{
	ps.println(request.getHeader("Cookie"));	
	//if((cc[i].getName()).equals("First"))
	//ps.println(cc[i].getValue());
	//{
         ps.println(cc[i].getName()+" : " );
         ps.println(cc[i].getValue()+"<br>");
	//}
        }
   }
}	


     
   