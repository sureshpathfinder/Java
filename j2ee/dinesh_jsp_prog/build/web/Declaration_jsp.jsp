<%-- 
    Document   : Declaration_jsp
    Created on : Nov 7, 2011, 8:09:41 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!                                           // Declaration type
            int x=10; 
            static int add(int a,int b)
                {
                    return (a+b);
                }
            
        %>
        
        
        
        
       <%                                            // Scriplet Type
                int y=add(10,20);
                out.println("Output for addition = "+y);
        %> 
        
        
        <%= new java.util.Date()%>                    <%-- Expression --%>
        
        
    </body>
</html>
