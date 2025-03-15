package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class items_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<pre>\n");
      out.write("<form>\n");
      out.write("<h2>Select The Items</h2>\n");
      out.write("<table border=2> \n");
      out.write("<th>\n");
      out.write("<th>Books\n");
      out.write("<th>Price\n");
      out.write("<tr><td><input type=checkbox name=item1 value=\"JavaCompleteReference\"><td>JavaCompleteReference<td>125$\n");
      out.write("<tr><td><input type=checkbox name=item2 value=\"PureJavaScript\"><td>PureJavaScript<td>122$\n");
      out.write("<tr><td><input type=checkbox name=item3 value=\"CoreServlets\"><td>CoreServlets<td>225$\n");
      out.write("<tr><td><input type=checkbox name=item4 value=\"ThinkingInJava\"><td>ThinkingInJava<td>325$\n");
      out.write("</table>\n");
      out.write("<input type=submit name=\"Add\"  value=\"AddToCart\"><input type=submit name=\"View\"  value=\"ViewCart\"><input type=submit name=\"Check\"  value=\"CheckOut\">\n");
      out.write("</form>\n");
      out.write("</pre>\n");
      out.write("   ");
      
        String addaction=request.getParameter("Add");
        if(addaction!=null) {
          if(addaction.equals("AddToCart")) {
	String paramname,paramval;
	Enumeration em = request.getParameterNames();
      
	while (em.hasMoreElements())
	{
		paramname = (String) em.nextElement();
	        paramval  = request.getParameter(paramname);
                session.setAttribute(paramname,paramval);
	}

        }
        }
        String viewaction=request.getParameter("View");
	if(viewaction!=null)
	 if (viewaction.equals("ViewCart")){
    
      out.write("\n");
      out.write("\t\t");
      if (true) {
        _jspx_page_context.forward("viewcart.jsp");
        return;
      }
      out.write("\t\t\n");
      out.write("    ");
 }
        String checkaction=request.getParameter("Check");
	if(checkaction!=null)
           if (checkaction.equals("CheckOut")){
    
      out.write("\t\n");
      out.write("\t\t");
      if (true) {
        _jspx_page_context.forward("checkout.html");
        return;
      }
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    ");
  }  
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
