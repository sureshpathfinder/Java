<%-- 
    Document   : useBeanjsp
    Created on : Nov 10, 2011, 10:46:06 PM
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
        <jsp:useBean id="userBean" class="MY.MyBean"  />
        <jsp:setProperty name="userBean" property="user" value="Dinesh"/>
        <jsp:getProperty name="userBean" property="user"/>
    </body>
</html>
