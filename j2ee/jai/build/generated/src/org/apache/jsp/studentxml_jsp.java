package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentxml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");

	//System.out.println("HI");
	Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
		String id=request.getParameter("id");
                                  
		if(id==null) id="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");						
                        stmt=con.createStatement();
                        out.print("<students>");
                  	String query_div="select * from student where student_id="+id;
                        rs=stmt.executeQuery(query_div);
                       while (rs.next())
                        {
                                	out.print("\n\t<student>");
					out.print("\n\t\t<id>"+rs.getInt(1) + "</id>\n");
					out.print("\t\t<age>"+rs.getInt(2) +"</age>\n");
                                        out.print("\t\t<fname>"+rs.getString(3) +"</fname>\n");
                                        out.print("\t\t<lname>"+rs.getString(4) +"</lname>\n");
                                        out.print("\t\t<email>"+rs.getString(5) +"</email>\n");
                                        out.print("\t\t<contact_no>"+rs.getString(6) +"</contact_no>\n");
                                        out.print("\t\t<dept_id>"+rs.getInt(7) +"</dept_id>\n");
					out.print("\t</student>\n");
			}
				out.print("</students>\n");
				
			
				
			}
			catch (Exception e){
                        out.print(e);
                        }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
