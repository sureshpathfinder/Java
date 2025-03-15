<%-- 
    Document   : parameters1
    Created on : Nov 9, 2011, 7:16:35 PM
    Author     : THENNARASU
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="2">
        <%
            Enumeration en=request.getParameterNames();
            while(en.hasMoreElements())
                               {
                                String name=(String)en.nextElement();
                                String val=request.getParameter(name);
                                out.println("<tr><td>"+name+"<td>"+val);
                               }
            
            
        %></table>
    </body>
</html>
