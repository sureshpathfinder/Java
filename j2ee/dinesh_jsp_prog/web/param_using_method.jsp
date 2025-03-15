<%-- 
    Document   : param_using_method
    Created on : Nov 9, 2011, 7:41:12 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> You Have Selected </h1><ul>



<%!
 void getparam(HttpServletRequest request,JspWriter out) throws IOException,ServletException
{
   	int i;
	for(i=0;i<request.getParameterValues("items").length;i++)
	{
	out.println("<li>" + request.getParameterValues("items")[i]);
	 }
}
%>

<% getparam(request,out);%>

    </body>
</html>
