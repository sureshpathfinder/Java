<%-- 
    Document   : getuser
    Created on : Apr 17, 2012, 12:54:33 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
        String a=request.getParameter("q");
        out.print("Value : "+a);
        %>
    </body>
</html>
