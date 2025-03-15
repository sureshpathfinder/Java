<%-- 
    Document   : session_usebean
    Created on : Nov 10, 2011, 11:21:41 PM
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
        <jsp:useBean id="userBean" scope="session" class="MY.MyBean">
            <jsp:setProperty name="userBean" property="*"/>
        </jsp:useBean>
        Bean placed in session
    </body>
</html>
