<%-- 
    Document   : Example_prog_jsp
    Created on : Nov 7, 2011, 8:25:44 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@
                page import="java.util.*"
                errorPage="fail.jsp"
                
 %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! 
            int fact(int n)
            {
                int s=1;
                for(int i=1;i<=n;i++)
                    s=s*i;
                    return s;
            }
        %>
            
        5! = <%= fact(5) %><br>
        6! = <%= fact(6) %><br>
        
        7! = <%= fact(7) %>
    </body>
</html>
