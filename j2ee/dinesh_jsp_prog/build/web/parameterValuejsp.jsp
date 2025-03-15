<%-- 
    Document   : parameterValuejsp
    Created on : Nov 9, 2011, 7:29:30 PM
    Author     : THENNARASU
--%>

<%@page import="org.hibernate.validator.constraints.Length"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> You selected : <br>
        <%
            int i;
            for(i=0; i<request.getParameterValues("item").length; i++)
            {
                out.println("<li>"+request.getParameterValues("item")[i]);                
            }
        %>
    </body>
</html>
