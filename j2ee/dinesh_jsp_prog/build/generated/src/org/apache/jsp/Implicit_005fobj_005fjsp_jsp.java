package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Implicit_005fobj_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Implicit Object</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>9 Implicit Object in JSP</p>\n");
      out.write("        <p>Application : used to access in same page</p>\n");
      out.write("        <p>Config : It provide info about the parameter</p>\n");
      out.write("        <p>Exception : used to define an error</p>\n");
      out.write("        <p>Out : used to return output to the client</p>\n");
      out.write("        <p>pageContext : used to provide method and functionality of custom action</p>\n");
      out.write("        <p>Request : Getting info</p>\n");
      out.write("        <p>page : Instance of the jsp page's</p>\n");
      out.write("        <p>response : used to return the info to the client</p>\n");
      out.write("        <p>session : used for the client</p>\n");
      out.write("        \n");
      out.write("        <form action=\"parameters1.jsp\" method=\"get\">\n");
      out.write("                Name:<input type=\"text\" name=\"t1\" /><br />\n");
      out.write("                Age: <input type=\"text\" name=\"t2\" /><br>\n");
      out.write("                     <input type=\"submit\" value=\"Click\" name=\"btn\"/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
